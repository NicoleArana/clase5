package game;

import java.net.URL;

import javax.swing.*;

public class Goomba implements Enemy {
    @Override
    public void showEnemy(JLabel label) {
        URL imageUrl = getClass().getClassLoader().getResource("game/images/goomba.png");
        
        if (imageUrl != null) {
            ImageIcon icon = new ImageIcon(imageUrl);
            label.setIcon(icon);
            label.setText("Ataque de Goomba");
        } else {
            System.out.println("Imagen no encontrada Koopa.");
        }
        
    }
}