package estructurales.facade;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Encendiendo computadora...\n");

        ComputadoraFacade computadora = new ComputadoraFacade();

        computadora.encender();
    }
}