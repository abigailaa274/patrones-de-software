
package creacionales.abstractFactory;

//Paso 4: Implementar las Fábricas Concretas
//Cada fábrica se encarga de una variante específica

public class FabricaVictoriana implements FabricaMuebles {
    public Sofa crearSofa() {
        return new SofaVictoriano();
    }

    public Silla crearSilla() {
        return new SillaVictoriana();
    }
}

