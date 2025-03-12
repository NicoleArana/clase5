package enemigos;

import observer.Observador;

// Koopa implementa la interfaz Observador
public class Koopa implements Observador {
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Koopa: " + mensaje + " ¡Voy a esconderme en mi caparazón!");
    }
}

