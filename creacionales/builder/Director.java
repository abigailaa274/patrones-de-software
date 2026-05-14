package creacionales.builder;
//Paso 4: La Clase Directora (Opcional pero recomendada)
//Define el orden en el que se deben ejecutar los pasos para configuraciones específicas, permitiendo reutilizar rutinas de construcción

public class Director {
    private CasaBuilder builder; // guarda el builder actual dentro del director

    public Director(CasaBuilder builder) {
        this.builder = builder; // inicializa el director con un builder concreto
    }

    public void changeBuilder(CasaBuilder builder) {
        this.builder = builder; // permite cambiar de builder en tiempo de ejecución
    }

    public void make(String tipo) {
        builder.reset(); // reinicia el builder antes de construir un nuevo producto
        if ("lujo".equalsIgnoreCase(tipo)) { //esto es lo mismo que decir if tipo="lujo" pero ignorando las mayusculas.
            builder.construirParedes();
            builder.construirTecho();
            builder.construirPiscina();
        } else {
            builder.construirParedes();
            builder.construirTecho();
            // no se construye piscina para el tipo simple
        }
    }
}