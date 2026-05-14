public class LogisticaTerrestre extends Logistica {
   // 4. Creadores Concretos que sobrescriben el método [8]
    @Override
    public Transporte crearTransporte() {
        return new Camion();
    }

}
