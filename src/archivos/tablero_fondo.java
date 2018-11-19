package archivos;

import java.awt.*;
import javax.swing.*;

public class tablero_fondo extends javax.swing.JPanel {
    private JButton botones [][];
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
        this.botones = new JButton [8][8];
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
                this.botones[i][j] = new JButton();
                this.botones[i][j].setSize(66, 62);
                this.botones[i][j].setLocation(33 + i * 66, j + 30 + j * 62);
                //this.botones[i][j].addActionListener(this);
                this.botones[i][j].setVisible(true);
                this.botones[i][j].setOpaque(false);
                this.botones[i][j].setEnabled(false);
                this.botones[i][j].setContentAreaFilled(false);
                this.botones[i][j].setBorderPainted(true);

                this.add(this.botones[i][j]);
            }
        }
        //Debemos agregar si es el jugador dos :v porque las pantallas seran diferentes
        for(int i=0;i<8;i++) {
            for (int j = 0; j < 2; j++) {
                this.botones[i][j].setEnabled(true);
                if(j==0){
                    if( i == 0 || i == 7)
                        this.botones[i][j].setIcon(torreN);
                    else if( i == 1 || i == 6)
                        this.botones[i][j].setIcon(caballoN);
                    else if( i == 2 || i == 5)
                        this.botones[i][j].setIcon(alfilN);
                    else if( i == 4 )
                        this.botones[i][j].setIcon(reyN);
                    else
                        this.botones[i][j].setIcon(reinaN);
                }else
                    this.botones[i][j].setIcon(peonN);
            }
        }
        for(int i=0;i<8;i++) {
            for (int j = 6; j < 8; j++) {
                this.botones[i][j].setEnabled(true);
                if(j==7){
                    if( i == 0 || i == 7)
                        this.botones[i][j].setIcon(torreB);
                    else if( i == 1 || i == 6)
                        this.botones[i][j].setIcon(caballoB);
                    else if( i == 2 || i == 5)
                        this.botones[i][j].setIcon(alfilB);
                    else if( i == 4 )
                        this.botones[i][j].setIcon(reyB);
                    else
                        this.botones[i][j].setIcon(reinaB);
                }else
                    this.botones[i][j].setIcon(peonB);
            }
        }
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
    }

    public void setjFramePadre(JFrame jFramePadre) {
        this.jFramePadre = jFramePadre;
    }
}
