package estructurales.bridge;

public class Demo {
    public static void main(String[] args) {
        System.out.println("=== PATRON BRIDGE: Control Remoto y Radio ===\n");
        
        // Crear una "Implementacion" (Radio)
        Dispositivo radio = new Radio();
        
        // Crear "Abstraccion" (ControlRemoto)
        ControlRemoto control = new ControlRemoto(radio);
        
        System.out.println("--- Usando ControlRemoto basico ---");
        control.botonEncendido();
        
        System.out.println("\nSubiendo volumen:");
        control.subirVolumen();
        
        System.out.println("\nSubiendo volumen nuevamente:");
        control.subirVolumen();
        
        System.out.println("\nBajando volumen:");
        control.bajarVolumen();
        
        System.out.println("\nApagando radio:");
        control.botonEncendido();
        
        System.out.println("\n--- Usando ControlRemotoAvanzado ---");
        ControlRemotoAvanzado controlAvanzado = new ControlRemotoAvanzado(radio);
        
        System.out.println("\nEncendiendo radio:");
        controlAvanzado.botonEncendido();
        
        System.out.println("\nSubiendo volumen:");
        controlAvanzado.subirVolumen();
        
        System.out.println("\nActivando silencio:");
        controlAvanzado.silencio();
        
        System.out.println("\n=== FIN DEMO ===");
    }
}
