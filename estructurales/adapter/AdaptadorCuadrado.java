package estructurales.adapter;

// La Clase Adaptadora "disfraza" la pieza cuadrada como redonda
public class AdaptadorCuadrado extends PiezaRedonda {
    
    // 1. Campo para almacenar el objeto de servicio
    private PiezaCuadrada pieza;

    public AdaptadorCuadrado(PiezaCuadrada pieza) {
        this.pieza = pieza;
    }

    // 2. Implementar métodos traduciendo los datos
    @Override
    public double getRadio() {
        // El radio es la mitad de la diagonal del cuadrado (para que quepa)
        return (pieza.getAncho() * Math.sqrt(2) / 2);
    }    
    @Override           
    //Llama a la lógica de la clase padre basada en el nuevo radio adaptado.
    public double getDiametro() {
        return super.getDiametro();
    }  
}

