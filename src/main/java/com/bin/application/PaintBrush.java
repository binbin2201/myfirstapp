package com.bin.application;

import java.awt.*;

public class PaintBrush {
    private static final Color BROWN1= new Color(92, 62, 36);
    private static final Color BROWN2= new Color(74, 47, 23);
    private static final Color DARKGREEN= new Color(5, 56, 22);
    private static final Color LIGHTGREEN= new Color(56, 224, 112);
    /*private static final Color = new Color();
    private static final Color = new Color();
    private static final Color = new Color();
    private static final Color = new Color();*/
    private Graphics g;
    public PaintBrush(Graphics graphics){
        g = graphics;
    }
    public void drawSky(){
        PaintBrush myBrush = new PaintBrush(g);
        //g.setColor(Color.blue);
        g.setColor(new Color(36, 179, 201));
        g.fillRect(0,0,1600,600);
        g.setColor(Color.yellow);
        //g.fillOval(x,y,width,height);
        g.fillOval(1250,200,60,60);
    }
    public void drawMountains(){
        g.setColor(BROWN1);
        Polygon triangle = new Polygon();
        triangle.addPoint(413,208);//top
        triangle.addPoint(708,591);//bottom right
        triangle.addPoint(177,720);//bottom left
        g.fillPolygon(triangle);
        g.setColor(BROWN2);
        Polygon triangle2 = new Polygon();
        //座標用小畫家，把畫板比例調成jframe螢幕大小
        triangle2.addPoint(641,305);
        triangle2.addPoint(492,644);
        triangle2.addPoint(1133,704);
        triangle2.addPoint(913,143);
        triangle2.addPoint(709,376);
        g.fillPolygon(triangle2);
    }
    public void drawClouds(){
        g.setColor(Color.white);
        Polygon cloudShape = new Polygon();
        cloudShape.addPoint(152,18);
        cloudShape.addPoint(257,22);
        cloudShape.addPoint(271,73);
        cloudShape.addPoint(298,79);
        cloudShape.addPoint(289,127);
        cloudShape.addPoint(217,133);
        cloudShape.addPoint(203,157);
        cloudShape.addPoint(119,155);
        cloudShape.addPoint(40,117);
        cloudShape.addPoint(42,83);
        cloudShape.addPoint(84,56);
        cloudShape.addPoint(151,44);
        g.fillPolygon(cloudShape);
    }
    public void drawGrass(){
        //製作由上往下的漸層
        GradientPaint mixGrass = new GradientPaint(0,0,DARKGREEN,0,1000,LIGHTGREEN);
        //漸層不是一個java constant
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(mixGrass);
        g2.fillRect(0,600,1600,900);
    }
}
