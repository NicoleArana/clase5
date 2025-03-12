package game;

//Creador Concreto

public class GoombaFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Goomba();
    }
}