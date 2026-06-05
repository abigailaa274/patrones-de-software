package estructurales.decorator;

// Paso 1: Definir la Interfaz (Componente)
//Es la base común para el objeto original y todos sus decoradores

// Interfaz común
public interface Notificador {
    void enviar(String mensaje);
}
