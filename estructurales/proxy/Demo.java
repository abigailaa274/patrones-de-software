package estructurales.proxy;

public class Demo {
    public static void main(String[] args) {
        LibreriaYoutube proxy = new YoutubeProxy();
        
        // La primera vez descarga realmente
        proxy.descargarVideo("video_123"); 
        
        // La segunda vez el proxy lo sirve desde su caché
        proxy.descargarVideo("video_123"); 
    }

}
