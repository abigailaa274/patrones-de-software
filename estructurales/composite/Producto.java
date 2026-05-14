package estructurales.composite;

// Paso 2: Crear la clase Hoja (Leaf)
// Representa los productos individuales. No tienen hijos.
public class Producto implements Componente {
    private double precio;

    public Producto(double precio) { this.precio = precio; }

    @Override
    public double getPrecio() {
        return this.precio; // Simplemente devuelve su valor [5]
    }
}