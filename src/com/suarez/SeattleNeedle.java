package com.suarez;
/*
This program will vary the size of the Seattle Space Needle.

Varun Gande
12/16/2019
Version 1
 */
public class SeattleNeedle {

    public static final int SIZE=5; // Indicates the size of the space needle

    public static void main(String[] args) {
        thinPart(); //needle
        skyDeck();
        bottomBulge();
        thinPart();
        apartment();
        skyDeck();
    }

    public static void thinPart() {
        for(int line=1; line<= SIZE; line++) {
            for(int space=1; space<=3*SIZE; space++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void upperTop() {
        for(int line=1; line <= SIZE; line++) {
            for(int space=1; space <= -3*line+3*SIZE; space++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            for(int colon=1; colon <= 3*(line-1); colon++){
                System.out.print(":");
            }
            System.out.print("||");
            for(int colon=1; colon <= 3*(line-1); colon++){
                System.out.print(":");
            }
            System.out.println("\\__");
        }
    }

    public static void quotes() {
        System.out.print("|");
        for (int quote=1; quote <= 6*SIZE; quote++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void bottomBulge() {
        for (int line=1; line <= SIZE; line++) {
            for(int space=1; space <=2*(line-1); space++) {
                System.out.print(" ");
            }
            System.out.print("\\_/");
            for (int bf=1; bf <= 3*SIZE-2*line; bf++) {
                System.out.print("\\/");
            }
            System.out.println("\\_/");
        }
    }

    public static void apartment() {
        for(int line=1; line <= 4*SIZE; line++) {
            for(int space=1; space <= 3*(SIZE-1); space++) {
                System.out.print(" ");
            }
            System.out.println("|%%||%%|");
        }
    }

    public static void skyDeck() {
        upperTop();
        quotes();
    }
}
