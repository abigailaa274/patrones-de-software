package estructurales.bridge;

//Paso 3: Crear la Abstracción Base
//Contiene una referencia al objeto de implementación. Delega el trabajo real a ese objeto
public class ControlRemoto {
    // El "puente" hacia la implementación
    protected Dispositivo dispositivo;

    public ControlRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void botonEncendido() {
        System.out.println("[ControlRemoto.botonEncendido] Presionando boton encendido/apagado...");
        if (dispositivo.estaHabilitado()) 
            dispositivo.deshabilitar();
        else 
            dispositivo.habilitar();
    }
    
    public void subirVolumen() {
        System.out.println("[ControlRemoto.subirVolumen] Subiendo volumen...");
        int volumen = dispositivo.getVolumen();
        dispositivo.setVolumen(Math.min(volumen + 10, 100));
    }
    
    public void bajarVolumen() {
        System.out.println("[ControlRemoto.bajarVolumen] Bajando volumen...");
        int volumen = dispositivo.getVolumen();
        dispositivo.setVolumen(Math.max(volumen - 10, 0));
    }
}
