// 3. Clase Creadora [8]
//Esta clase declara el Factory Method (crearTransporte). Su función principal no es solo crear, sino contener lógica de negocio que use el producto
public abstract class Logistica {
    
    // El Factory Method [8]
    public abstract Transporte crearTransporte();

    // Lógica de negocio que usa el transporte sin saber cuál es [8]
    public void planificarEntrega() {
        Transporte t = crearTransporte();
        t.entrega();
    }

}
