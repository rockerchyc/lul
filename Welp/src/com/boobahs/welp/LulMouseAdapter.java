package com.boobahs.welp;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class LulMouseAdapter implements MouseListener{

    private Color background;
    private int xDown = -1;
    private int yDown = -1;
    private int xClick = -1;
    private int yClick = -1;

    @Override
    public void mousePressed(MouseEvent e) {
        xDown = e.getX();
        yDown = e.getY();
        xClick = e.getX();
        yClick = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        xDown = -1;
        yDown = -1;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public int getXDown(){
        return xDown;
    }

    public int getYDown(){
        return yDown;
    }

    public int getXClick(){
        return xClick;
    }

    public int getYClick(){
        return yClick;
    }

}