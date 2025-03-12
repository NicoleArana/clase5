import observer.Sujeto;
import enemigos.Koopa;
import enemigos.Goomba;

public class Main {
    public static void main(String[] args) {
        Sujeto mario = new Sujeto();

        Koopa koopa = new Koopa();
        Goomba goomba = new Goomba();

        mario.agregarObservador(koopa);
        mario.agregarObservador(goomba);

        // Mario recoge una estrella y los enemigos reaccionan
        System.out.println("Mario ha recogido una estrella 🌟");
        mario.notificarObservadores("¡Mario tiene estrella! Corre por tu vida.");
    }
}
