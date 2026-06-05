package estructurales.flyweight;

public class TipoArbol {

    private String nombre;
    private String color;
    private String textura;

    public TipoArbol(String nombre, String color, String textura) {
        this.nombre = nombre;
        this.color = color;
        this.textura = textura;
    }

    public void dibujar(long x, long y) {
        System.out.println(
            "Dibujando " + nombre +
            " color: " + color +
            " textura: " + textura +
            " en (" + x + "," + y + ")"
        );
    }
}