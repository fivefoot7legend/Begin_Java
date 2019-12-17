package com.suarez;

public class exclamationPoint {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        bot();
    }




    public static void bot(){
        for (int line=1; line <= SIZE; line++){
            for (int space=1; space <= line-1; space++){
                System.out.print("\\");
            }
            for (int space=1; space <= -2*line+2*SIZE; space++) {
                System.out.print("!");
            }
            for (int space=1; space <= line-1; space++){
                System.out.print("/");
            }
            System.out.println();
        }

    }
}
