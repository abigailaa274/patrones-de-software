package creacionales.prototype;
//Paso 1: Crear la interfaz o clase base

public abstract class Forma {
    public int x, y;
    public String color;

    // Constructor normal
    public Forma() {}

    // 1. Constructor de copia: acepta un objeto de la misma clase [9]
    public Forma(Forma target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    // 2. Método de clonación abstracto
    public abstract Forma clonar();
}

