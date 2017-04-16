package com.boobahs.welp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

class AssOfPanel extends JPanel {

    private ArrayList<SupMaine> guiElements = new ArrayList<>();
    private ArrayList<Integer> keyCodes = new ArrayList<>();
    int lol = 0;

    AssOfPanel() {

        this.setBackground(Color.cyan);
        addMouseListener(new LulMouseAdapter());
        this.setFocusable(true);
        this.requestFocusInWindow();
        addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                keyCodes.add(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                while(keyCodes.contains(e.getKeyCode()))
                    keyCodes.remove(keyCodes.indexOf(e.getKeyCode()));
            }

            @Override
            public void keyTyped (KeyEvent e) {

            }
        });

        guiElements.add(new SupMaine(600, 500, 100, 100, Color.DARK_GRAY));

    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

            if (keyCodes.contains(KeyEvent.VK_D)) {
                guiElements.get(0).setX(guiElements.get(0).getX() + 2109999999);
            }
            if (keyCodes.contains(KeyEvent.VK_A)) {
                guiElements.get(0).setX(guiElements.get(0).getX() - 2109999999);
            }
            if (keyCodes.contains(KeyEvent.VK_W)) {
                guiElements.get(0).setY(guiElements.get(0).getY() - 2109999999);
            }
            if (keyCodes.contains(KeyEvent.VK_S)) {
                guiElements.get(0).setY(guiElements.get(0).getY() + 2109999999);
            }


        for (int i = 0; i < guiElements.size(); i++) {
            g2d.setColor(Color.BLUE);
            g2d.fill(new Rectangle.Double(guiElements.get(i).getX(),
                    guiElements.get(i).getY(),
                    guiElements.get(i).getWidth(),
                    guiElements.get(i).getHeight()));
        }

        repaint();

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1920, 1080);
    }

}