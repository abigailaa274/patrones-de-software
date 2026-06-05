package decomportamiento.observer;

// Implementar observadores concretos
class Editor implements EventListener {
    private String nombre;

    public Editor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String tipoEvento, String archivo) {
        System.out.println("[" + nombre + "] Notificación recibida: " + tipoEvento + 
                         " en archivo: " + archivo);
    }
}

class LogHandler implements EventListener {
    private String rutaLog;

    public LogHandler(String rutaLog) {
        this.rutaLog = rutaLog;
    }

    @Override
    public void actualizar(String tipoEvento, String archivo) {
        System.out.println("[LogHandler] Se registró en log (" + rutaLog + "): " + 
                         tipoEvento + " -> " + archivo);
    }
}

class AlertaSeguridad implements EventListener {
    @Override
    public void actualizar(String tipoEvento, String archivo) {
        if ("ELIMINADO".equals(tipoEvento)) {
            System.out.println("[ALERTA SEGURIDAD] Archivo eliminado: " + archivo);
        } else if ("MODIFICADO".equals(tipoEvento)) {
            System.out.println("[ALERTA SEGURIDAD] Archivo modificado: " + archivo);
        }
    }
}

// Clase Demo
public class Demo {
    public static void main(String[] args) {
        System.out.println("=== DEMO PATRÓN OBSERVER ===\n");

        // Crear el gestor de eventos (sujeto/publisher)
        EventManager gestor = new EventManager();

        // Crear observadores concretos
        Editor editor1 = new Editor("Editor_1");
        Editor editor2 = new Editor("Editor_2");
        LogHandler logger = new LogHandler("/var/logs/app.log");
        AlertaSeguridad alerta = new AlertaSeguridad();

        // Suscribir observadores a eventos específicos
        System.out.println("Suscribiendo observadores...\n");
        
        gestor.suscribir("CREADO", editor1);
        gestor.suscribir("CREADO", logger);
        
        gestor.suscribir("MODIFICADO", editor1);
        gestor.suscribir("MODIFICADO", editor2);
        gestor.suscribir("MODIFICADO", logger);
        gestor.suscribir("MODIFICADO", alerta);
        
        gestor.suscribir("ELIMINADO", logger);
        gestor.suscribir("ELIMINADO", alerta);

        // Simular eventos
        System.out.println("--- Evento: CREADO ---");
        gestor.notificar("CREADO", "documento.txt");
        
        System.out.println("\n--- Evento: MODIFICADO ---");
        gestor.notificar("MODIFICADO", "documento.txt");
        
        System.out.println("\n--- Evento: ELIMINADO ---");
        gestor.notificar("ELIMINADO", "documento.txt");

        // Desuscribir un observador
        System.out.println("\n--- Desuscribiendo editor1 de MODIFICADO ---\n");
        gestor.desuscribir("MODIFICADO", editor1);
        
        System.out.println("--- Evento: MODIFICADO (después de desuscribir) ---");
        gestor.notificar("MODIFICADO", "otro_archivo.txt");
    }
}
