package estructurales.flyweight;

public class Arbol {

    private long x;
    private long y;

    private TipoArbol tipo;

    public Arbol(long x, long y, TipoArbol tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void dibujar() {
        tipo.dibujar(x, y);
    }
}