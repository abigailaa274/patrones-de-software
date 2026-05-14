// 4. Creadores Concretos que sobrescriben el método [8]
public class LogisticaMaritima extends Logistica {
    @Override
    public Transporte crearTransporte() {
        return new Barco();
    }
}