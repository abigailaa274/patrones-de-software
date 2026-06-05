package estructurales.decorator;

// Demo del patrón Decorator
public class Demo {
    public static void main(String[] args) {
        // Notificación básica (solo correo)
        Notificador notificadorBasico = new NotificadorBase();
        System.out.println("=== Notificación básica ===");
        notificadorBasico.enviar("Hola Mundo");

        // Notificación decorada (correo + SMS)
        Notificador notificadorConSMS = new SmsDecorator(new NotificadorBase());
        System.out.println("\n=== Notificación con SMS ===");
        notificadorConSMS.enviar("Hola Mundo con SMS");
    }
}