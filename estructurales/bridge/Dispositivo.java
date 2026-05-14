package estructurales.bridge;
//Utilizaremos el ejemplo de Controles Remotos (Abstracción) y Dispositivos (Implementación) mencionado en las fuentes
//Paso 1: Definir la interfaz de Implementación
//Declara los métodos comunes para todos los dispositivos de bajo nivel


// Esta es la "Implementación"
public interface Dispositivo {
    boolean estaHabilitado();
    void habilitar();
    void deshabilitar();
    int getVolumen();
    void setVolumen(int percent);
}