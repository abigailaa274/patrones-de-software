package estructurales.bridge;

//Paso 2: Crear Implementaciones Concretas
//Aquí escribes el código específico para cada plataforma o aparato
public class Radio implements Dispositivo {
    private int volumen = 10;
    private boolean encendido = false;

    public boolean estaHabilitado() { 
        System.out.println("  [Radio.estaHabilitado] Verificando si esta habilitado: " + encendido);
        return encendido; 
    }
    
    public void habilitar() { 
        System.out.println("  [Radio.habilitar] Encendiendo la radio...");
        encendido = true; 
    }
    
    public void deshabilitar() { 
        System.out.println("  [Radio.deshabilitar] Apagando la radio...");
        encendido = false; 
    }
    
    public int getVolumen() { 
        System.out.println("  [Radio.getVolumen] Volumen actual: " + volumen);
        return volumen; 
    }
    
    public void setVolumen(int v) { 
        System.out.println("  [Radio.setVolumen] Estableciendo volumen a: " + v);
        this.volumen = v; 
    }
}