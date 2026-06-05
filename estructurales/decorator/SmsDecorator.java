package estructurales.decorator;

//Paso 4: Crear Decoradores Concretos
//Añaden la funcionalidad extra antes o después de llamar al objeto envuelto
public class SmsDecorator extends BaseDecorator {
    public SmsDecorator(Notificador n) { super(n); }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje); // Ejecuta lo anterior (ej: el correo)
        enviarSMS(mensaje);    // Añade la nueva función
    }

    private void enviarSMS(String m) {
        System.out.println("Enviando SMS: " + m);
    }
}
