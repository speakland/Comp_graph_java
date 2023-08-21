package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import static org.example.Fill.floodFill;

public class main {

    public static void main(String[] args) {
        int width = 500;
        int height = 500;

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();

        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, width, height);

        g2d.setColor(Color.WHITE);
        g2d.fillOval(100, 100, 200, 200);

        floodFill(image, 150, 150, Color.WHITE, Color.RED);

        JFrame frame = new JFrame();
        frame.getContentPane().add(new JLabel(new ImageIcon(image)));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
