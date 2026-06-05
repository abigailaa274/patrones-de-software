package estructurales.proxy;

public class YoutubeProxy implements LibreriaYoutube {
    private LibreriaYoutube servicioReal;
    private String cache;

    @Override
    public void descargarVideo(String id) {
        // Lógica de Proxy de Caché
        if (cache == null) {
            // Inicialización diferida: solo creamos el servicio si se pide
            if (servicioReal == null) {
                servicioReal = new ServicioYoutubeReal();
            }
            servicioReal.descargarVideo(id);
            cache = "Datos del video " + id;
        } else {
            System.out.println("Recuperando del caché: " + cache);
        }
    }
}