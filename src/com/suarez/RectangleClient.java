package com.suarez;

public class RectangleClient {

    public static void main(String[] args) {
        int size = Rectangle.Box();
        System.out.println();
        Point p1 = new Point();
        p1.randomPoint(size);
        Point p2 = new Point();
        p2.randomPoint(size);
        Point p3 = new Point();
        p3.randomPoint(size);
        Point p4 = new Point();
        p4.randomPoint(size);

        Rectangle.BoxBox(size, p1, p2, p3, p4);
        System.out.println();
        System.out.println("(" + p1.GetX() + "," + (size-1-p1.GetY()) + ")");
        System.out.println("(" + p2.GetX() + "," + (size-1-p2.GetY()) + ")");
        System.out.println("(" + p3.GetX() + "," + (size-1-p3.GetY()) + ")");
        System.out.println("(" + p4.GetX() + "," + (size-1-p4.GetY()) + ")");
    }
}
