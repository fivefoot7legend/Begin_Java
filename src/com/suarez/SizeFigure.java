package com.suarez;
/*
Changing the size of a figure
Varun Gande
12/6/2019
Version 1
 */
public class SizeFigure {
    public static final int SIZE=105;
    public static void main(String [] args){
        top();
        bot();
        System.out.println();
        bot();
        top();
    }
    public static void top(){
        for (int line=1; line <= SIZE; line++){
            for (int space=1; space <= -line + SIZE + 1; space++){
                System.out.print(" ");
            }
            System.out.print("/");
            for (int spacebtwn=1; spacebtwn <= 2*line - 2; spacebtwn++){
                System.out.print(" ");
            }
            System.out.println("\\");
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
