package decomportamiento.observer;
import java.util.*;

// Paso 2: Crear el Gestor de Eventos (Notificador)
// Esta clase maneja la infraestructura de suscripción (la lista y los métodos para añadir/quitar)

public class EventManager {
    // 2. Campo matriz para almacenar referencias a suscriptores
    private Map<String, List<EventListener>> oyentes = new HashMap<>();

    public void suscribir(String tipoEvento, EventListener oyente) {
        oyentes.computeIfAbsent(tipoEvento, k -> new ArrayList<>()).add(oyente);
    }

    public void desuscribir(String tipoEvento, EventListener oyente) {
        List<EventListener> lista = oyentes.get(tipoEvento);
        if (lista != null) {
            lista.remove(oyente);
        }
    }

    // 3. Método que recorre la lista e invoca la notificación
    public void notificar(String tipoEvento, String archivo) {
        List<EventListener> lista = oyentes.get(tipoEvento);
        if (lista != null) {
            for (EventListener oyente : lista) {
                oyente.actualizar(tipoEvento, archivo);
            }
        }
    }
}

