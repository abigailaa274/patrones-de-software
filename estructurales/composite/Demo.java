package estructurales.composite;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Ejemplo de Patrón Composite");

        System.out.println("Creamos una caja");
        Caja cajaGrande = new Caja();
        System.out.println("Agregamos un producto suelto");
        cajaGrande.agregar(new Producto(100)); // Un producto suelto

        System.out.println("Creamos una caja pequeña");
        Caja cajaPequena = new Caja();
        System.out.println("Agregamos un producto a la caja pequeña");
        cajaPequena.agregar(new Producto(50));
        System.out.println("Agregamos la caja pequeña a la caja grande");
        cajaGrande.agregar(cajaPequena); // Una caja dentro de otra

        System.out.println("Total: " + cajaGrande.getPrecio());
    }
}
