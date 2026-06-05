package estructurales.flyweight;

public class Demo {

    public static void main(String[] args) {

        Bosque bosque = new Bosque();

        bosque.plantarArbol(10, 20,
                "Roble", "Verde", "Rugosa");

        bosque.plantarArbol(50, 80,
                "Roble", "Verde", "Rugosa");

        bosque.plantarArbol(100, 40,
                "Pino", "Verde Oscuro", "Lisa");

        bosque.plantarArbol(150, 90,
                "Roble", "Verde", "Rugosa");

        System.out.println("\n--- DIBUJANDO BOSQUE ---\n");

        bosque.dibujar();
    }
}