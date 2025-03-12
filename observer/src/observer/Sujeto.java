package observer;

import java.util.ArrayList;
import java.util.List;

// Clase que gestiona los observadores y notifica cambios
public class Sujeto {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador obs) {
        observadores.add(obs);
    }

    public void eliminarObservador(Observador obs) {
        observadores.remove(obs);
    }

    public void notificarObservadores(String mensaje) {
        for (Observador obs : observadores) {
            obs.actualizar(mensaje);
        }
    }
}
