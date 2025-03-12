

import adaptadores.AdaptadorKoopa;
import enemigos.Enemigo;
import enemigos.Goomba;
import enemigos.Koopa;
import java.util.ArrayList;
import java.util.List;

import adaptadores.AdaptadorGoomba;

public class Main {
    public static void main(String[] args) {
        // Lista de enemigos en el juego
        List<Enemigo> enemigos = new ArrayList<>();

        // Agregamos enemigos estándar usando los adaptadores
        enemigos.add(new AdaptadorKoopa(new Koopa()));
        enemigos.add(new AdaptadorGoomba(new Goomba()));

        // Mario se enfrenta a los enemigos
        System.out.println("¡Mario se enfrenta a los enemigos!");
        for (Enemigo enemigo : enemigos) {
            enemigo.atacar();
        }
    }
}