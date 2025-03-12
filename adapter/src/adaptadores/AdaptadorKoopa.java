package adaptadores;

import enemigos.Enemigo;
import enemigos.Koopa;

public class AdaptadorKoopa implements Enemigo {
    private Koopa koopa;

    public AdaptadorKoopa(Koopa koopa) {
        this.koopa = koopa;
    }

    @Override
    public void atacar() {
        koopa.girarYAtacar();
    }
}