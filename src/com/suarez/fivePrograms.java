package com.suarez;

import java.util.*;

public class fivePrograms {

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        boolean gamePlay = true;
        System.out.print("Loading programs");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        System.out.print(".");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        System.out.print(".");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        System.out.print(".");
        while (gamePlay) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.print("\n\n\n");
            System.out.println("Which program would you like to run?");
            System.out.println("Type:\n\t1: xo\n\t2: smallestLargest\n\t3: printGPA\n\t4: longestName\n\t5: printTriangleType\n\t6: diceyRoll\n\t7: sortingNumbers\n\n\t-1: Exit Program");
            int programNumber = console.nextInt();
            if (programNumber == 1) {
                xo();
            } else if (programNumber == 2) {
                smallestLargest();
            } else if (programNumber == 3) {
                printGPA();
            } else if (programNumber == 4) {
                longestName();
            } else if (programNumber == 5) {
                printTriangleType();
            } else if (programNumber == 6) {
                diceyRoll();
            } else if (programNumber >= 8) {
                System.out.print("ERROR");
            } else if (programNumber == 7) {
                sortingNumbers();
            } else if (programNumber == -1) {
                gamePlay = false;
                System.out.println("Thanks for playing!");
            }
        }
    }

    public static void xo() {
        //This program will accept an integer and print a square with an X and O pattern
        Scanner console = new Scanner(System.in);
        System.out.println("What side length of the square do you want?");
        int squareSize = console.nextInt();
        if (squareSize >= 1) {
            for (int row = 1; row <= squareSize; row++) {
                for (int column = 1; column <= squareSize; column++) {
                    if (row == column || row + column == squareSize + 1) {
                        System.out.print("x");
                    }
                    else {
                        System.out.print("o");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void smallestLargest() {
        //This program will identify the smallest and largest numbers in a given set of integers
        Scanner console = new Scanner(System.in);
        int minimum = 1000;
        int maximum = 0;
        System.out.print("How many numbers do you want to enter?");
        int numbers = console.nextInt();
        int[] intArray = new int[numbers];
        for (int Num = 1; Num <= numbers; Num++) {
            System.out.println ("Number " + Num + ":");
            intArray[Num-1] = console.nextInt();
        }
        for (int Num = 1; Num <= numbers; Num++) {
            if (intArray[Num-1] <= minimum) {
                minimum = intArray[Num-1];
            }
            if (intArray[Num-1] >= maximum) {
                maximum = intArray[Num-1];
            }
        }
        System.out.println("Smallest = " + minimum);
        System.out.println("Largest = " + maximum);
    }

    public static void printGPA() {
        //This program will calculate a GPA by taking the average of grades
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a student record: ");
        String name = console.next();
        int number = console.nextInt();
        double sum = 0.0;
        for (int score = 0; score <= number-1; score++) {
            int scores = console.nextInt();
            sum = sum + scores;
        }
        double average = sum / number;
        System.out.print(name + "'s grade is ");
        System.out.printf("%.2f", average);

    }

    public static void longestName() {
        //This program will print the longest name in a given set of names
        Scanner console = new Scanner(System.in);
        String longest = "";
        boolean tie = false;
        System.out.print("How many names do you want to print?");
        int numberNames = console.nextInt();
        for (int name = 1; name <= numberNames; name++) {
            System.out.print ("name #" + name + ":");
            String nameName = console.next();
            if (nameName.length() == longest.length()) {
                tie = true;
            }
            else if (nameName.length() > longest.length()) {
                tie = false;
                longest = nameName;
            }
            else {
                tie = false;
            }
        }
        String capitalized = longest.substring(0, 1).toUpperCase() + longest.substring(1).toLowerCase();
        if (tie == true) {
            System.out.print ("It's a tie!");
        }
        else {
            System.out.println(capitalized + "'s name is longest");
        }
    }

    public static void printTriangleType() {
        //This program will print the type of a triangle given its side lengths
        Scanner console = new Scanner(System.in);
        System.out.print("Print the three sides of the triangle: ");
        int side1 = console.nextInt();
        int side2 = console.nextInt();
        int side3 = console.nextInt();
        System.out.println("printTriangleType(" + side1 + "," + side2 + "," + side3 + ")");
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            System.out.println("not a possible triangle");
        }
        else if (side1 == side2 && side2 == side3) {
            System.out.println("equilateral");
        }
        else if ((side1 == side2) || (side2 == side3) || (side1 == side3)) {
            System.out.println("isosceles");
        }
        else {
            System.out.println("scalene");
        }
    }

    public static void diceyRoll() {
        int sum = 0;
        int counter = 0;
        Random rand = new Random();
        while (sum != 7) {
            int a = rand.nextInt(6) + 1;
            int b = rand.nextInt(6) + 1;
            sum = a + b;
            System.out.println(a + " + " + b + " = " + (a + b));
            counter++;
        }
        System.out.println("You won after " + counter + " tries!");
    }

    public static void sortingNumbers() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many numbers do you want to sort?");
        int numbers = console.nextInt();
        int[] intArray1 = new int[numbers];
        for (int Num = 1; Num <= numbers; Num++) {
            System.out.println ("Number " + Num + ":");
            intArray1[Num-1] = console.nextInt();
        }
        Arrays.sort(intArray1);
        System.out.printf("Sorted : %s", Arrays.toString(intArray1));
    }
}
