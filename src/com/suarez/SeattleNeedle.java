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
        skyDeck(); //top half of the skydeck
        bottomBulge(); //bottom half of the skydeck
        thinPart(); //needle between the skydeck and offices
        apartment(); //tall narrow part of skyscraper (offices)
        skyDeck(); //bottom structure
    }

    public static void thinPart() {
        for(int line=1; line<= SIZE; line++) {
            //for loop for the lines where the number of lines is equal to the size
            for(int space=1; space<=3*SIZE; space++) {
                System.out.print(" ");
            }
            //for loop within the line loop for the spaces before the "||", which is calculated by the expression 3*SIZE
            System.out.println("||"); //prints "||", moves to a new line, and repeats the line loop for the next line
        }
    }

    public static void upperTop() {
        for(int line=1; line <= SIZE; line++) {
            //for loop for the lines, where the number of lines is equal to the size
            for(int space=1; space <= -3*line+3*SIZE; space++) {
                System.out.print(" ");
            }
            //for loop within the line loop for the number of spaces before "__/", which is calculated by the expression -3*line + 3*SIZE
            System.out.print("__/"); //prints the "__/" which is common among all lines of the upper half of the skydeck
            for(int colon=1; colon <= 3*(line-1); colon++){
                System.out.print(":");
            }
            //for loop within the line loop for the number of colons between "__/" and "||", which is calculated by the expression 3*(line - 1)
            System.out.print("||"); //prints the "||" which is common among all lines of the upper half of the skydeck
            for(int colon=1; colon <= 3*(line-1); colon++){
                System.out.print(":");
            }
            //for loop within the line loop for the number of colons between "||" and "\__", which is exactly the same as the for colon loop before because the skyscraper is symmetrical
            System.out.println("\\__"); //prints "\__", moves to a new line, and repeats the line loop for the next line
        }
    }

    public static void quotes() {
        System.out.print("|"); //prints a "|"
        for (int quote=1; quote <= 6*SIZE; quote++) {
            System.out.print("\"");
        }
        //for loop for the number of quotes between the two "|"s, which is calculated by the expression 6*SIZE
        System.out.println("|"); //prints the second "|" and moves to a new line for the next method
    }

    public static void bottomBulge() {
        for (int line=1; line <= SIZE; line++) {
            //for loop for the lines, where the number of lines is equal to the size
            for(int space=1; space <=2*(line-1); space++) {
                System.out.print(" ");
            }
            //for loop within the line loop for the number of spaces before the first "\_/", which is calculated by the expression 2*(line - 1)
            System.out.print("\\_/"); //prints the first "\_/"
            for (int bf=1; bf <= 3*SIZE-2*line; bf++) {
                System.out.print("\\/");
            }
            //for look within the line loop for the number of "\/" repeats between the two "\_/"s, which is calculated by the expression 3*SIZE - 2*line
            System.out.println("\\_/"); //prints the second "\_/" and moves to a new line for the next method
        }
    }

    public static void apartment() {
        for(int line=1; line <= 4*SIZE; line++) {
            //for loop for the lines, where the number of lines is equal to 4*SIZE
            for(int space=1; space <= 3*(SIZE-1); space++) {
                System.out.print(" ");
            }
            //for loop within the line loop for the number of spaces before "|%%||%%|", which is calculated by the expression 3*(SIZE - 1)
            System.out.println("|%%||%%|"); //prints "|%%||%%|" (which is common for all the lines) and moves to a new line for the next method
        }
    }

    public static void skyDeck() {
        upperTop(); //top half of skydeck
        quotes(); //dividing line between the top and bottom halves of the skydeck (and the foundation at the bottom of the skyscraper)
    }
}
