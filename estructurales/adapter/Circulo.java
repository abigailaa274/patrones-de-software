package estructurales.adapter;

// Clase que representa un circulo redondo
public class Circulo extends PiezaRedonda {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double getRadio() {
        return radio;
    }
}
