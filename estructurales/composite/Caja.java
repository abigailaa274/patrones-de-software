package estructurales.composite;
import java.util.*;


// Paso 3: Crear la clase Contenedora (Composite)
// Esta clase tiene una lista de subelementos y recorre dicha lista para calcular el total.
public class Caja implements Componente {
    // Lista que puede guardar tanto Productos como otras Cajas [3]
    private List<Componente> hijos = new ArrayList<>();

    public void agregar(Componente c) { hijos.add(c); }

    @Override
    public double getPrecio() {
        double total = 0;
        // Delegación recursiva: pide el precio a cada hijo [5, 6]
        for (Componente hijo : hijos) {
            total += hijo.getPrecio();
        }
        return total;
    }
}