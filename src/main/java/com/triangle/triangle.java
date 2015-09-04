package com.triangle;


import java.awt.*;

/**
 * Created by plank-arfaa on 9/2/2015.
 */
public class triangle {
    private point pointA;
    private point pointB;
    private point pointC;

    public point getPointB() {
        return pointB;
    }

    public void setPointB(point pointB) {
        this.pointB = pointB;
    }

    public point getPointA() {
        return pointA;
    }

    public void setPointA(point pointA) {
        this.pointA = pointA;
    }

    public point getPointC() {
        return pointC;
    }

    public void setPointC(point pointC) {
        this.pointC = pointC;
    }
    /* private String type;
    private int height;

    public int getHeight() {
        return height;
    }

    public triangle(String type)
    {
        this.type = type;
    }
    public triangle(String type, int height)
    {
        this.type = type;
        this.height=height;
    }

    public  String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }*/

    public void draw() {

        System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
        System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
        System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
    }
}

