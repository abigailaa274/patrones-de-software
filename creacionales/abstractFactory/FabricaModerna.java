package creacionales.abstractFactory;

//Paso 4: Implementar las Fábricas Concretas
//Cada fábrica se encarga de una variante específica

public class FabricaModerna implements FabricaMuebles {
    public Sofa crearSofa() {
        return new SofaModerno();
    }

    public Silla crearSilla() {
        return new SillaModerna();
    }
}
