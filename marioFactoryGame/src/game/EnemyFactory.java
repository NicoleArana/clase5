package game;

//Creator (Creador)

public abstract class EnemyFactory {
    // Método abstracto que las subclases deben implementar para crear un objeto Enemy.
    // El método devuelve un objeto de tipo Enemy, pero las subclases decidirán 
    // qué tipo específico de Enemy crear
    public abstract Enemy createEnemy();
}