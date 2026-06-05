package decomportamiento.observer;

// Paso 1: Definir la Interfaz Suscriptora
// Todos los observadores deben poder ser llamados de la misma forma.
// 1. La interfaz común para todos los suscriptores
public interface EventListener {
    void actualizar(String tipoEvento, String archivo);
}