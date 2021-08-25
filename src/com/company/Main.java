package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Main extends JPanel{

    ceil dropped = new ceil(100,100);
    int wRand, hRand;

    Main(){
        JFrame fr = new JFrame("osu");
        fr.add(this);
        fr.setVisible(true);
        fr.setSize(1000,1000);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getX() >= dropped.x && e.getX() <= dropped.x + 79 && e.getY() >= dropped.y && e.getY() <= dropped.y + 79)
                    repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getX() >= dropped.x && e.getX() <= dropped.x + 79 && e.getY() >= dropped.y && e.getY() <= dropped.y + 79)
                    repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }

    public void paintComponent( Graphics g ){
        super.paintComponent(g);
        Random dropper = new Random();
        g.setColor(new Color(dropper.nextInt(255), dropper.nextInt(255), dropper.nextInt(255)));
        dropped.x = dropper.nextInt(950);
        dropped.y = dropper.nextInt(950);
        wRand = dropper.nextInt(100);
        hRand = dropper.nextInt(100);
        g.fillRect(dropped.x, dropped.y,   50, 50);
    }
}
