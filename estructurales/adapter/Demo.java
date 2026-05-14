package estructurales.adapter;

public class Demo {
    public static void main(String[] args) {
        // Crear un circulo
        Circulo circulo = new Circulo(5);
        System.out.println("=== Circulo ===");
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Diametro: " + circulo.getDiametro());
        
        System.out.println();
        
        // Crear pieza cuadrada y adaptarla
        PiezaCuadrada piezaC = new PiezaCuadrada(10);
        PiezaRedonda adaptador = new AdaptadorCuadrado(piezaC);
        System.out.println("=== Cuadrado (adaptado) ===");
        System.out.println("Ancho: " + piezaC.getAncho());
        System.out.println("Radio adaptado: " + adaptador.getRadio());
        System.out.println("Diametro adaptado: " + adaptador.getDiametro());
        
        System.out.println();
        
        // Verificar si encaja en el agujero
        AgujeroRedondo agujero = new AgujeroRedondo(8);
        System.out.println("=== Verificacion de encaje ===");
        System.out.println("Radio del agujero: " + agujero.getRadio());
        
        if (agujero.encaja(adaptador)) {
            System.out.println("La pieza cuadrada encajo gracias al adaptador.");
        } else {
            System.out.println("La pieza cuadrada no encajo.");
        }
    }
}

