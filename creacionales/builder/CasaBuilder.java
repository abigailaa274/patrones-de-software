//Paso 2: La Interfaz Constructora
//Declara los pasos de construcción comunes a todos los tipos de objetos constructores
package creacionales.builder;

public interface CasaBuilder {
    void reset(); // reinicia el estado interno del builder
    void construirParedes();
    void construirTecho();
    void construirPiscina();
    Casa getResultado(); // Para extraer el producto
}