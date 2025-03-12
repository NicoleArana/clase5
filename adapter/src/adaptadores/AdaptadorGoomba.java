package adaptadores;

import enemigos.Enemigo;
import enemigos.Goomba;

public class AdaptadorGoomba implements Enemigo {
    private Goomba goomba;

    public AdaptadorGoomba(Goomba goomba) {
        this.goomba = goomba;
    }

    @Override
    public void atacar() {
        goomba.caminarYAtacar();
    }
}