package com.suarez;

import java.util.*;

public class Rectangle {

    public static int Box() {
        Scanner console = new Scanner(System.in);
        System.out.print("What size box?");
        int size = console.nextInt();

        for (int dash = 1; dash <= size + 2; dash++) {
            System.out.print("~");
        }
        System.out.println();
        for (int rows = 1; rows <= size; rows++) {
            System.out.print("|");
            for (int columns = 0; columns <= size-2; columns++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        for (int dash = 1; dash <= size + 2; dash++) {
            System.out.print("~");
        }
        return size;
    }

    public static void BoxBox(int size, Point p1, Point p2, Point p3, Point p4) {
        for (int dash = 1; dash <= size + 2; dash++) {
            System.out.print("~");
        }
        System.out.println();
        for (int lines = 1; lines <= size; lines++) {
            System.out.print("|");
            for (int x = 0; x <= size-2; x++) {
                if(((p1.GetX() == x && p1.GetY() == lines)||(p2.GetX() == x && p2.GetY() == lines)||(p3.GetX() == x && p3.GetY() == lines)||(p4.GetX() == x && p4.GetY() == lines))) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("|");
        }
        for (int dash = 1; dash <= size + 2; dash++) {
            System.out.print("~");
        }
    }
}



