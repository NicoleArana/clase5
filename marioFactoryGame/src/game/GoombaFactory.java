package game;

public class GoombaFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Goomba();
    }
}