package com.boobahs.welp;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Welcome_There'sNothingSuspiciousGoingOnHere...");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                AssOfPanel assOfPanel = new AssOfPanel();
                frame.setContentPane(assOfPanel);
                frame.pack();
                frame.setVisible(true);
            }
        });

    }

}