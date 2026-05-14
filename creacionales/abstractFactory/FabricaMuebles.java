package creacionales.abstractFactory;

//Paso 3: Crear la Interfaz de la Fábrica Abstracta
//Aquí declaramos los métodos para crear cada producto de la familia

public interface FabricaMuebles {
    Sofa crearSofa();
    Silla crearSilla();
}
