package creacionales.singleton;

public class Demo {
    public static void main(String[] args) {
        System.out.println("=== Demo del Patrón Singleton ===");

        // Primer intento de obtener la instancia
        System.out.println("Obteniendo la primera instancia de BaseDeDatos...");
        BaseDeDatos db1 = BaseDeDatos.obtenerInstancia();

        // Segundo intento de obtener la instancia
        System.out.println("Obteniendo la segunda instancia de BaseDeDatos...");
        BaseDeDatos db2 = BaseDeDatos.obtenerInstancia();

        // Tercer intento de obtener la instancia (para mostrar que es la misma)
        System.out.println("Obteniendo la tercera instancia de BaseDeDatos...");
        BaseDeDatos db3 = BaseDeDatos.obtenerInstancia();

        // Verificar que son la misma instancia
        System.out.println("¿db1 == db2? " + (db1 == db2));
        System.out.println("¿db2 == db3? " + (db2 == db3));
        System.out.println("¿db1 == db3? " + (db1 == db3));

        // Nota: Intentar crear con 'new' daría error de compilación
        // BaseDeDatos dbError = new BaseDeDatos(); // Esto no compilaría

        System.out.println("Todas las instancias son la misma: " + (db1 == db2 && db2 == db3));
    }
}