package creacionales.singleton;

//Paso 1: El campo estático
//Añade un campo privado y estático para almacenar la instancia.
public class BaseDeDatos {
    // 1. Campo estático privado para la instancia única
    private static BaseDeDatos instancia;
    
    //Paso 2: El constructor privado
    //Oculta el constructor para que otros objetos no puedan usar el operador new.
    // 2. Constructor privado (nadie más puede instanciarla)
    private BaseDeDatos() {
        // Lógica de conexión, ej: conectar al servidor
        System.out.println("Instancia de BaseDeDatos creada");
    }
    //Paso 3: El método de creación estático
    //Este método actúa como el "constructor" público. Implementa la inicialización diferida (el objeto solo se crea cuando se pide por primera vez)
    // 3. Método público para obtener la instancia
    public static BaseDeDatos obtenerInstancia() {
        if (instancia == null) {
            // Si es la primera vez, creamos el objeto
            instancia = new BaseDeDatos();
        }
        // Siempre devolvemos el mismo objeto guardado en 'instancia'
        return instancia;
    }
}