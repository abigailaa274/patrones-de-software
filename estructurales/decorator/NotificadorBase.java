package estructurales.decorator;

// Paso 2: Crear el Componente Concreto
// Comportamiento base: solo correo
public class NotificadorBase implements Notificador {
    public void enviar(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);
    }
}