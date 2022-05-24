package com.bin.application;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        JFrame window = new JFrame("Drawing");
        Mycanvas canvas = new Mycanvas();
        window.add(canvas);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //fit window size around our canvas
        window.pack();
        //user can't resize window
        window.setResizable(false);
        //set window location in center of screen
        window.setLocationRelativeTo(null);
    }
}
class Mycanvas extends JPanel{
    public Mycanvas(){
        setPreferredSize(new Dimension(1600,900));
        setBackground(Color.white);


    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        PaintBrush myBrush = new PaintBrush(g);
        myBrush.drawSky();
        myBrush.drawGrass();
        myBrush.drawMountains();
        myBrush.drawClouds();
    }
}