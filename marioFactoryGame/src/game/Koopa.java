package game;

import javax.swing.*;
import java.net.URL;

public class Koopa implements Enemy {
    @Override
    public void showEnemy(JLabel label) {

        // Usar getClass().getClassLoader() para obtener el recurso con ruta relativa
        URL imageUrl = getClass().getClassLoader().getResource("game/images/koopa.png");
        
        if (imageUrl != null) {
            ImageIcon icon = new ImageIcon(imageUrl);
            label.setIcon(icon);
            label.setText("Ataque de koopa");
        } else {
            System.out.println("Imagen no encontrada Koopa.");
        }
    }
}