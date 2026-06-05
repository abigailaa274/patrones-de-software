package estructurales.facade;

public class ComputadoraFacade {

    private CPU cpu = new CPU();
    private Memoria memoria = new Memoria();
    private DiscoDuro disco = new DiscoDuro();

    public void encender() {

        cpu.iniciar();
        memoria.cargar();
        disco.leer();

        System.out.println("Computadora lista para usar.");
    }
}