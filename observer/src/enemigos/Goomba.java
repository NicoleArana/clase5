package enemigos;

import observer.Observador;

// Goomba implementa la interfaz Observador
public class Goomba implements Observador {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Goomba: " + mensaje + " ¡Voy a correr!");
    }
}