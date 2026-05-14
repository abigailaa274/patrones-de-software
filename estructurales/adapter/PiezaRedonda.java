package estructurales.adapter;

// Clase base que representa una pieza redonda
public abstract class PiezaRedonda {
    public abstract double getRadio();
    
    //Calcula el diametro basado en el radio
    public double getDiametro() {
        return getRadio() * 2;
    }
}
