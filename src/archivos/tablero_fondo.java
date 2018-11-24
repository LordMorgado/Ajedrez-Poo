package archivos;

import java.awt.*;
import javax.swing.*;

public class tablero_fondo extends javax.swing.JPanel {
    int Matriz[][] = new int[8][8];
    private JFrame jFramePadre;
    public tablero_fondo() {
        initComponents();
        setSize(600,600);
    }
    @Override
    protected void paintComponent(Graphics g) {
        ImageIcon imagenFondo = new ImageIcon(getClass().
                getResource("img/tablero.jpg"));
        g.drawImage(imagenFondo.getImage(), 0, 0,
                getSize().width, getSize().height, null);
        g.drawImage(imagenFondo.getImage(), 0, 0, getWidth(), getHeight(),this);
        setOpaque(false);
        super.paintComponent(g);
    }

    private void initComponents() {
        JButton[][] botones = new JButton[8][8];
        ImageIcon reyN = new ImageIcon(getClass().getResource("img/bk.png"));
        ImageIcon reinaN = new ImageIcon(getClass().getResource("img/bq.png"));
        ImageIcon alfilN = new ImageIcon(getClass().getResource("img/bb.png"));
        ImageIcon caballoN = new ImageIcon(getClass().getResource("img/bn.png"));
        ImageIcon torreN = new ImageIcon(getClass().getResource("img/br.png"));
        ImageIcon peonN = new ImageIcon(getClass().getResource("img/bp.png"));
        ImageIcon reyB = new ImageIcon(getClass().getResource("img/wk.png"));
        ImageIcon reinaB = new ImageIcon(getClass().getResource("img/wq.png"));
        ImageIcon alfilB = new ImageIcon(getClass().getResource("img/wb.png"));
        ImageIcon caballoB = new ImageIcon(getClass().getResource("img/wn.png"));
        ImageIcon torreB = new ImageIcon(getClass().getResource("img/wr.png"));
        ImageIcon peonB = new ImageIcon(getClass().getResource("img/wp.png"));
        for(int i=0;i<8;i++) {
            for (int j = 0; j < 8; j++) {
                botones[i][j] = new JButton();
                botones[i][j].setSize(66, 62);
                botones[i][j].setLocation(33 + i * 66, j + 30 + j * 62);
                //this.botones[i][j].addActionListener(this);
                botones[i][j].setVisible(true);
                botones[i][j].setOpaque(false);
                botones[i][j].setEnabled(false);
                botones[i][j].setContentAreaFilled(false);
                botones[i][j].setBorderPainted(true);

                this.add(botones[i][j]);
            }
        }
        //Debemos agregar si es el jugador dos :v porque las pantallas seran diferentes
        for(int i=0;i<8;i++) {
            for (int j = 0; j < 2; j++) {
                botones[i][j].setEnabled(true);
                if(j==0){
                    if( i == 0 || i == 7) {
                        botones[i][j].setIcon(torreN);
                        Matriz[i][j] = 2;
                    }
                    else if( i == 1 || i == 6) {
                        botones[i][j].setIcon(caballoN);
                        Matriz[i][j] = 3;
                    }
                    else if( i == 2 || i == 5) {
                        botones[i][j].setIcon(alfilN);
                        Matriz[i][j] = 4;
                    }
                    else if( i == 4 ) {
                        botones[i][j].setIcon(reyN);
                        Matriz[i][j] = 6;
                    }
                    else {
                        botones[i][j].setIcon(reinaN);
                        Matriz[i][j] = 5;
                    }
                }else{
                    botones[i][j].setIcon(peonN);
                    Matriz[i][j] = 1;
            }}
        }
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){
                System.out.print(Matriz[i][j]);
            }
            System.out.println();
        }

        //aqui debemos asignar valores a la matriz, para identificar las piezas, pero creo que se deberían agregar numeros diferentes a los del jugador 1
        for(int i=0;i<8;i++) {
            for (int j = 6; j < 8; j++) {
                botones[i][j].setEnabled(true);
                if(j==7){
                    if( i == 0 || i == 7)
                        botones[i][j].setIcon(torreB);
                    else if( i == 1 || i == 6)
                        botones[i][j].setIcon(caballoB);
                    else if( i == 2 || i == 5)
                        botones[i][j].setIcon(alfilB);
                    else if( i == 4 )
                        botones[i][j].setIcon(reyB);
                    else
                        botones[i][j].setIcon(reinaB);
                }else
                    botones[i][j].setIcon(peonB);
            }
        }
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
    }

    public void setjFramePadre(JFrame jFramePadre) {
        this.jFramePadre = jFramePadre;
    }
}
