package com.suarez;

public class PointClient {

    public static void main (String[] args) {
        Point p1 = new Point();
        System.out.println("(" + p1.GetX() + " , " + p1.GetY() + ")");
        Point p2 = new Point(-2,10);
        System.out.println("(" + p2.GetX() + " , " + p2.GetY() + ")");
        double distance = p1.distance();
        System.out.println("distance = " + distance);
        distance = p2.distance();
        System.out.println("distance = " + distance);
        distance = p2.distance(p1);
        System.out.println("distance = " + distance);
        p1.translate(0, 3);
        System.out.println("(" + p1.GetX() + " , " + p1.GetY() + ")");
    }
}
