package com.suarez;
/*
This program will produce a star slash space

Varun Gande
12/10/2019
Version 1
 */
public class starSlashSpace {

    public static final int SIZE = 10;

    public static void main(String[] args) {
        for (int line=1; line <= SIZE+1; line++) {
            stars(line);
            space(line);
            fslashes(line);
            bslashes(line);
            space(line);
            stars(line);
            System.out.println();
        }
    }

    public static void stars(int line) {
        for (int star=1; star <= -line+SIZE+1; star++) {
            System.out.print("*");
        }
    }

    public static void space(int line) {
        for (int space=1; space <=line; space++) {
            System.out.print(" ");
        }
    }

    public static void fslashes(int line) {
        for (int fslash = 1; fslash <= -2*line+2*SIZE+2; fslash++){
            System.out.print("/");
        }
    }

    public static void bslashes(int line) {
        for (int bslash = 1; bslash <= 2*line-2; bslash++){
            System.out.print("\\");
        }
    }


}
