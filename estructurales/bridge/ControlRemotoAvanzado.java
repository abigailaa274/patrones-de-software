package estructurales.bridge;

//Paso 4: Crear Abstracciones Refinadas
//Son variantes que añaden lógica de control más compleja sin cambiar los dispositivos
public class ControlRemotoAvanzado extends ControlRemoto {
    public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void silencio() {
        System.out.println("[ControlRemotoAvanzado.silencio] Activando modo silencio...");
        dispositivo.setVolumen(0);
    }
}