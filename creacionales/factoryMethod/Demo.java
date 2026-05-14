/**
 * Demostración del patrón Factory Method
 * Este ejemplo muestra cómo crear y usar objetos Barco y Camion
 * a través de sus respectivas clases creadoras (LogisticaMaritima y LogisticaTerrestre)
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("=== Demostración del Patrón Factory Method ===\n");

        // Crear logística terrestre y usar Camion
        System.out.println("1. Logística Terrestre:");
        Logistica logisticaTerrestre = new LogisticaTerrestre();
        logisticaTerrestre.planificarEntrega();

        // Crear logística marítima y usar Barco
        System.out.println("\n2. Logística Marítima:");
        Logistica logisticaMaritima = new LogisticaMaritima();
        logisticaMaritima.planificarEntrega();
        
        System.out.println("\n=== Fin de la demostración ===");
    }
}