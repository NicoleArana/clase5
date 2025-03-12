package game;


//Extenciones
//Language Support for Java(TM) by Red Hat

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Ventana principal del juego
public class MarioGame extends JFrame {
    private JLabel enemyLabel; // Donde se mostrará el enemigo
    private EnemyFactory factory; // Fabrica de enemigos

    public MarioGame() {
        setTitle("Mario - Factory Method");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Label para el enemigo
        enemyLabel = new JLabel("", SwingConstants.CENTER);
        add(enemyLabel, BorderLayout.CENTER);

        // Botón para generar un enemigo aleatorio
        JButton spawnButton = new JButton("Generar Enemigo");
        add(spawnButton, BorderLayout.SOUTH);

        spawnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateEnemy();
            }
        });

        setVisible(true);
    }

    private void generateEnemy() {
        // Generamos un enemigo aleatorio
        if (Math.random() > 0.5) {
            System.out.println("GoombaFactory run :D");
            factory = new GoombaFactory();
        } else {
            System.out.println("KoopaFactory run :D");
            factory = new KoopaFactory();
        }

        Enemy enemy = factory.createEnemy();
        enemy.showEnemy(enemyLabel); // Mostrar el enemigo en pantalla
    }

    public static void main(String[] args) {
        new MarioGame();
    }
}
