package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

public class Fill {
    public static void floodFill(BufferedImage image, int x, int y, Color targetColor, Color fillColor) {

        int width = image.getWidth();
        int height = image.getHeight();

        int targetRGB = targetColor.getRGB();
        int fillRGB = fillColor.getRGB();

        if (targetRGB == fillRGB) {
            return;
        }

        int startRGB = image.getRGB(x, y);

        if (startRGB != targetRGB) {
            return;
        }

        LinkedList<Point> stack = new LinkedList<>();
        stack.push(new Point(x, y));

        while (!stack.isEmpty()) {
            Point point = stack.pop();
            x = point.x;
            y = point.y;

            if (x >= 0 && x < width && y >= 0 && y < height && image.getRGB(x, y) == targetRGB) {
                image.setRGB(x, y, fillRGB);

                stack.push(new Point(x + 1, y));
                stack.push(new Point(x - 1, y));
                stack.push(new Point(x, y + 1));
                stack.push(new Point(x, y - 1));
            }
        }
    }
}