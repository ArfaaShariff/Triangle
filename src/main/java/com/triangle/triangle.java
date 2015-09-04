package com.triangle;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.awt.*;
import java.util.List;

/**
 * Created by plank-arfaa on 9/2/2015.
 */
public class triangle implements ApplicationContextAware,BeanNameAware{
   /* private List<point>points;

    public List<point> getPoints() {
        return points;
    }

    public void setPoints(List<point> points) {
        this.points = points;
    }*/
     private point pointA;
    private point pointB;
    private point pointC;
    private ApplicationContext context=null;

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
     /*private String type;
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

        /*for(point point : points){
            System.out.println("Point = (" + point.getX() + ", " + point.getY() + ")");

        }*/

        System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
        System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
        System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");

    }


    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException
    {
        this.context=context;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean name is "+beanName);

    }
}

