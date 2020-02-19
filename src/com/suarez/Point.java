package com.suarez;

import java.util.Random;

public class Point {
    private int x;
    private int y;
    public Point() {
        x = 0;
        y = 1;
    }

    public Point(int x1, int y1) {
        if (x1 >= 0) {
            x = x1;
        }
        else {
            System.err.println("Sorry, no negative values allowed!");
        }
        y = y1;
    }

    public void location(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public void SetX(int x1) {
        x = x1;
    }

    public void SetY(int y1) {
        y = y1;
    }

    public int GetX() {
        return x;
    }

    public int GetY() {
        return y;
    }

    public double distance () {
        return Math.sqrt(x*x+y*y);
    }

    public double distance (Point p) {
        double x2 = p.x;
        double y2 = p.y;
        return Math.sqrt(Math.pow(x-x2, 2) + Math.pow(y-y2,2));
    }

    public void translate (int x1, int y1) {
        x = x1 + x;
        y = y1 + y;
    }

    public void randomPoint(int size) {
        Random rand = new Random();
        int xRand = rand.nextInt(size) + 1;
        int yRand = rand.nextInt(size) + 1;
        x = xRand;
        y = yRand;
    }
}
