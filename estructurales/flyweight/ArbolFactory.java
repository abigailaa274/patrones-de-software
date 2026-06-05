package estructurales.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {

    private static Map<String, TipoArbol> tiposArbol = new HashMap<>();

    public static TipoArbol getTipoArbol(       
        //Con static, todas las fábricas comparten el mismo mapa.
            String nombre,
            String color,
            String textura) {

        TipoArbol tipo = tiposArbol.get(nombre);
        //Busca en el mapa si ya existe un flyweight con esa clave.

        if (tipo == null) {
            //Si es null, significa que todavía no fue creado.
            tipo = new TipoArbol(nombre, color, textura);
            tiposArbol.put(nombre, tipo);

            System.out.println("Creando nuevo TipoArbol: " + nombre);
        } else {
            System.out.println("Reutilizando TipoArbol: " + nombre);
        }

        return tipo;
    }
}