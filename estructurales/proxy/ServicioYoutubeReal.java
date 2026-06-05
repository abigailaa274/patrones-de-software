package estructurales.proxy;

public class ServicioYoutubeReal implements LibreriaYoutube {
    @Override
    public void descargarVideo(String id) {
        // Conexión real y descarga pesada de datos
        System.out.println("Descargando video de YouTube: " + id);
    }
}