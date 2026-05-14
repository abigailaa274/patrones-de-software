//Paso 3: Constructor Concreto
//Implementa los pasos de forma específica. Por ejemplo, una casa de madera frente a una de piedra
package creacionales.builder;

public class CasaPiedraBuilder implements CasaBuilder {
    private Casa casa = new Casa();

    public void reset() { this.casa = new Casa(); } // crea un nuevo producto para empezar de cero
    public void construirParedes() { casa.paredes = 4; }
    public void construirTecho() { casa.techo = "Techo de tejas"; }
    public void construirPiscina() { casa.tienePiscina = true; }

    public Casa getResultado() { return this.casa; }
}