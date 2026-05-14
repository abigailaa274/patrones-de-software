package creacionales.prototype;

public class Demo {
    public static void main(String[] args) {
        // Paso 3: Uso por el Cliente
        // El cliente puede clonar cualquier objeto que siga la interfaz sin conocer su clase real

        Circulo circuloOriginal = new Circulo();
        circuloOriginal.x = 10;
        circuloOriginal.y = 20;
        circuloOriginal.color = "Rojo";
        circuloOriginal.radio = 15;

        // El cliente obtiene una copia exacta sin saber que es un 'Circulo' específicamente
        Forma clon = circuloOriginal.clonar();

        // Verificar que la copia es independiente
        System.out.println("Original: x=" + circuloOriginal.x + ", y=" + circuloOriginal.y + ", color=" + circuloOriginal.color + ", radio=" + circuloOriginal.radio);
        System.out.println("Clon: x=" + clon.x + ", y=" + clon.y + ", color=" + clon.color + ", radio=" + ((Circulo)clon).radio);//señana que hay que tratar a clon como un circulo para ver su radio. Importante porque sino es tratado como Forma, no Circulo.

        // Modificar el clon para demostrar independencia
        clon.x = 50;
        ((Circulo)clon).radio = 30;

        System.out.println("Después de modificar el clon:");
        System.out.println("Original: x=" + circuloOriginal.x + ", y=" + circuloOriginal.y + ", color=" + circuloOriginal.color + ", radio=" + circuloOriginal.radio);
        System.out.println("Clon: x=" + clon.x + ", y=" + clon.y + ", color=" + clon.color + ", radio=" + ((Circulo)clon).radio);
    }
}