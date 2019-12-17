package com.suarez;
/*
This program will change the size of a star diamond

Varun Gande
12/9/2019
Version 1
 */
public class starDiamonds {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        plusDash();
        top();
        bot();
        plusDash();
        bot();
        top();
        plusDash();
    }


    public static void plusDash() {
        System.out.print("+");
        for (int dash = 1; dash <= 2 * SIZE - 1; dash++) {
            System.out.print("-");
        }
        System.out.println("+");



    }

    public static void bot() {
        for(int line=1; line <= SIZE; line++) {
            System.out.print("|");
            spaces2(line);
            bslashes2(line);
            System.out.print("*");
            fslashes2(line);
            spaces2(line);
            System.out.println("|");
        }
    }

    public static void top() {
        for(int line=1; line <= SIZE; line++) {
            System.out.print("|");
            spaces(line);
            fslashes(line);
            System.out.print("*");
            bslashes(line);
            spaces(line);
            System.out.println("|");
        }
    }

        public static void spaces(int line) {
            for (int space = 1; space <= -line+SIZE; space++) {
                System.out.print(" ");
            }
        }

        public static void spaces2 (int line) {
            for (int space = 1; space <= line-1; space++) {
                System.out.print(" ");
            }
        }

        public static void fslashes (int line) {
            for (int fslash = 1; fslash <= line - 1; fslash++) {
                System.out.print("/");
            }
        }

        public static void bslashes (int line) {
          for (int bslash = 1; bslash <= line - 1; bslash++) {
              System.out.print("\\");
            }
        }

        public static void fslashes2 (int line) {
            for (int fslash = 1; fslash <= SIZE-line; fslash++) {
                System.out.print("/");
            }
        }

        public static void bslashes2 (int line) {
            for (int bslash = 1; bslash <= SIZE-line; bslash++) {
                System.out.print("\\");
            }
        }
    }