package com.suarez;

public class rocketShip {

    public static final int SIZE=4;

    public static void main(String[] args) {
            jet();
            equalStar();
            top();
            bot();
            equalStar();
            bot();
            top();
            equalStar();
            jet();


    }

    public static void jet() {
        for (int line=1; line<= 2*SIZE-1; line++) {
            for(int space=1; space <= -line+2*SIZE-1; space++){
                System.out.print(" ");
            }
            for(int fslash=1; fslash<= line; fslash++) {
                System.out.print("/");
            }
            System.out.print("**");
            for(int bslash=1; bslash<= line; bslash++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void equalStar() {
        System.out.print("+");
        for(int eqStar=1; eqStar <= 2*SIZE; eqStar++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }

    public static void top() {
        for(int line=1; line <= SIZE; line++) {
            System.out.print("|");
            for(int dot=1; dot<=SIZE-line; dot++) {
                System.out.print(".");
            }
            for(int fb=1; fb<=line; fb++) {
                System.out.print("/\\");
            }
            for(int ddot=1; ddot<=2*(SIZE-line); ddot++) {
                System.out.print(".");
            }
            for(int fb=1; fb<=line; fb++) {
                System.out.print("/\\");
            }
            for(int dot=1; dot<=SIZE-line; dot++) {
                System.out.print(".");
            }
            System.out.println("|");
        }
    }

    public static void bot() {
        for(int line=1; line <= SIZE; line++) {
            System.out.print("|");
            for(int dot=1; dot<=line-1; dot++) {
                System.out.print(".");
            }
            for(int fb=1; fb<=SIZE-line+1; fb++) {
                System.out.print("\\/");
            }
            for(int ddot=1; ddot<=2*(line-1); ddot++) {
                System.out.print(".");
            }
            for(int fb=1; fb<=SIZE-line+1; fb++) {
                System.out.print("\\/");
            }
            for(int dot=1; dot<=line-1; dot++) {
                System.out.print(".");
            }
            System.out.println("|");
        }
    }
}
