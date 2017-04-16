package com.boobahs.welp;

import java.awt.*;

public class SupMaine {

    private double xLoc, yLoc, w, h;
    private Color color;
    private Color prevColor;
    private String text = "";
    private SupMaine child = null;

    public SupMaine(int xLoc, int yLoc, int w, int h, Color color){
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.w = w;
        this.h = h;
        this.color = color;
        prevColor = color;
    }

    public SupMaine(int xLoc, int yLoc, int w, int h, String text){
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.w = w;
        this.h = h;
        this.text = text;
        this.color = Color.WHITE;
        prevColor = this.color;
    }

    public double getX(){
        return xLoc;
    }

    public double getY(){
        return yLoc;
    }

    public void setX(double xLoc) {
        this.xLoc = xLoc;
    }

    public void setY(double yLoc) {
        this.yLoc = yLoc;
    }

    public double getWidth(){
        return w;
    }

    public double getHeight(){
        return h;
    }

    public Color getColor() {
        return color;
    }

    public String getText() { return text;}

    public Color getPrevColor() {
        return prevColor;
    }

    public SupMaine getChild() { return child;}

    public void setColor(Color color) {
        if (!color.equals(this.color)) {
            prevColor = this.color;
        }
        this.color = color;
    }

    public void setColorToPrev() {
        this.color = prevColor;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SupMaine setChild(SupMaine child) {
        this.child = child;
        return this.child;
    }

}