package archivos;

import javax.swing.*;
import java.awt.*;

public class tablero extends JFrame {
    public tablero() {
        initComponents();
        tablero_fondo panel = new tablero_fondo();
        panel.setjFramePadre(this);
        this.add(panel);
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ajedrez :v");
        setLocation(400,10);
        setSize(600,600);
        setResizable(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablero().setVisible(true);
            }
        });
    }
}
