package com.suarez;
/*
Changing the size of the ClassDiamond figure
Varun Gande
12/6/2019
Version 1
 */
public class SizeFigure {
    public static final int SIZE=105; //indicates the size of the figure produced
    public static void main(String [] args){
        top(); //prints the top half of the diamond
        bot(); //prints the bottom half of the diamond
        System.out.println(); //prints an empty line between the diamond and X
        bot();
        top(); //by switching the top and bottom of the diamond, an X is displayed
    }
    public static void top(){
        for (int line=1; line <= SIZE; line++){
            //for loop for each line, where the number of lines is equal to the size
            for (int space=1; space <= -line + SIZE + 1; space++){
                System.out.print(" ");
            }
            //for loop within the line loop indicating how many spaces are before the forward slash
            System.out.print("/"); //prints the forward slash
            for (int spacebtwn=1; spacebtwn <= 2*line - 2; spacebtwn++){
                System.out.print(" ");
            }
            //for loop within the line loop indicating how many spaces are between the forward and back slash
            System.out.println("\\"); //prints back slash and then moves to a new line, repeating the for loops for the following line
        }
    }
    public static void bot(){
        for (int line=1; line <= SIZE; line++){
            for (int space=1; space <= line; space++){
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int spacebtwn=1; spacebtwn <= -2*line + 2*SIZE; spacebtwn++){
                System.out.print(" ");
            }
            System.out.println("/");
        }
    }
}
