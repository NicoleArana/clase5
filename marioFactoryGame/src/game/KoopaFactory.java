package game;

public class KoopaFactory extends EnemyFactory {
    @Override
    public Enemy createEnemy() {
        return new Koopa();
    }
}