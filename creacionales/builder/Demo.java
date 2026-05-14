package creacionales.builder;

public class Demo {
    public static void main(String[] args) {
        CasaBuilder builderConPiscina = new CasaPiedraBuilder();
        CasaBuilder builderSinPiscina = new CasaPiedraBuilder();
        Director director = new Director(builderConPiscina); // crea director con un builder inicial

        director.make("lujo");
        Casa casaConPiscina = builderConPiscina.getResultado();

        director.changeBuilder(builderSinPiscina); // cambia al segundo builder
        director.make("simple");
        Casa casaSinPiscina = builderSinPiscina.getResultado();

        System.out.println("Casa con piscina:");
        System.out.println("- Paredes: " + casaConPiscina.paredes);
        System.out.println("- Techo: " + casaConPiscina.techo);
        System.out.println("- Piscina: " + (casaConPiscina.tienePiscina ? "sí" : "no"));

        System.out.println();
        System.out.println("Casa sin piscina:");
        System.out.println("- Paredes: " + casaSinPiscina.paredes);
        System.out.println("- Techo: " + casaSinPiscina.techo);
        System.out.println("- Piscina: " + (casaSinPiscina.tienePiscina ? "sí" : "no"));
    }
}
