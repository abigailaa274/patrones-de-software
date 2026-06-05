package estructurales.decorator;

// Paso 3: Crear el Decorador Base
// Esta clase guarda una referencia al objeto envuelto. Su trabajo es delegar todas las operaciones a ese objeto
public abstract class BaseDecorator implements Notificador {
    protected Notificador envoltorio;

    public BaseDecorator(Notificador n) {
        this.envoltorio = n;
    }

    public void enviar(String mensaje) {
        envoltorio.enviar(mensaje); // Delega la llamada
    }
}