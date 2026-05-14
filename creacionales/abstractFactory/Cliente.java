package creacionales.abstractFactory;

//Paso 5: El Código Cliente
//El cliente usa la fábrica sin saber qué estilo es

public class Cliente {
    private Sofa sofaCliente;
    private Silla sillaCliente;

    public Cliente(FabricaMuebles fabrica) {
        sofaCliente = fabrica.crearSofa();
        sillaCliente = fabrica.crearSilla();
    }

    // Método para usar los muebles creados por la fábrica.
    public void usarMuebles() {
        sillaCliente.sentarse();
        sofaCliente.acostarse();
    }
}

