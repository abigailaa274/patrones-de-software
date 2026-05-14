package creacionales.abstractFactory;

// Demo del patrón Abstract Factory
// Se muestran dos variantes de muebles: moderna y victoriana.
// También se usan directamente todos los objetos concretos.

public class Demo {
    public static void main(String[] args) {
        System.out.println("Demo Abstract Factory - Muebles Modernos y Victorianos");

        // Crear dos fábricas concretas
        FabricaMuebles fabricaModerna = new FabricaModerna();
        FabricaMuebles fabricaVictoriana = new FabricaVictoriana();

        // Usar el cliente con la fábrica moderna
        Cliente clienteModerno = new Cliente(fabricaModerna);
        System.out.println("\n=== Muebles Modernos ===");
        clienteModerno.usarMuebles();

        // Usar el cliente con la fábrica victoriana
        Cliente clienteVictoriano = new Cliente(fabricaVictoriana);
        System.out.println("\n=== Muebles Victorianos ===");
        clienteVictoriano.usarMuebles();

        System.out.println("\nFin de la demostración.");
    }
}
