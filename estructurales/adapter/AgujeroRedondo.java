package estructurales.adapter;

// Clase que el Cliente ya usa
public class AgujeroRedondo {
    private double radio;

    public AgujeroRedondo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public boolean encaja(PiezaRedonda pieza) {
        return pieza != null && pieza.getRadio() <= this.radio;
    }
}
