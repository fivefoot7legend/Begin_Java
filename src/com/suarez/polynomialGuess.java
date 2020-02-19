package com.suarez;

import java.util.*;

class polynomialGuess {

    static void delay(int millis) {
        //using try/catch method for a delay in the program
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

    static void ellipsis() {
        //displays three dots
        delay(500);
        System.out.print(".");
        delay(500);
        System.out.print(".");
        delay(500);
        System.out.println(".");
        delay(500);
    }

    static void ellipsisSameLine() {
        //display three dots on the same line as the text before
        delay(500);
        System.out.print(".");
        delay(500);
        System.out.print(".");
        delay(500);
        System.out.print(".");
        delay(500);
    }

    static void showExample() {
        Random rand = new Random(); //initializes Random
        int p1 = rand.nextInt(100) + 2;
        int p2 = rand.nextInt(100) + 2;
        int p3 = rand.nextInt(100) + 2;
        int p4 = rand.nextInt(100) + 2;
        int p5 = rand.nextInt(100) + 2;
        int p6 = rand.nextInt(100) + 2;
        int p7 = rand.nextInt(100) + 2;
        //forms 7 integers between 2 and 102, inclusive
        System.out.print("Think of a polynomial P(x) with non-negative integer coefficients and exponents. Examples include: ");
        System.out.print(p1 + "x^2 + " + p2 + ", " + p3 + "x + " + p4 + ", or " + p5 + "x^5 + " + p6 + "x^3 + " + p7);
        //uses the integers to form examples of acceptable polynomials
    }

    static void showWrongExample() {
        Random rand = new Random(); //initializes Random
        int p1 = rand.nextInt(100) + 2;
        int p2 = rand.nextInt(100) + 2;
        int p3 = rand.nextInt(100) + 2;
        //forms 3 integers between 2 and 102, inclusive
        System.out.println(", but not " + p1 + "x^5" + " - " + p2 + "sqrt(x)" + " + " + p3);
        //uses the integers to form an example of a non-acceptable polynomial
    }

    private static boolean isLongNotString(String booBoo) {
        //determines whether an input from the user can be parsed to long or not
        for (int index = 0; index <= booBoo.length()-1; index++) {
            if (!Character.isDigit(booBoo.charAt(index))) {
                return false;
                //in other words, if there is a character present at any index in the string, the statement "is a long" is false
            }
        }
        return true;
        //else, return true

    }

    static long isLongNotString2(String booBoo) {
        if (isLongNotString(booBoo)) {
            //if string can be parsed to long, return the parsed version
            return Long.parseLong(booBoo);
        }
        else {
            //if string cannot be parsed to long, return -1 (this will be used to allow the user to reinput a long)
            System.err.println ("ERROR. Please type in an integer value.");
            return -1;
        }
    }

    static long sumArray(long[] array, long size) {
        //returns the sum of an array
        long sum = 0; // initialize sum

        // iterate through all elements and add them to sum
        for (int index = 0; index <= size-1; index++) {
            sum = sum + array[index];
        }
        return sum;
    }

    static long[] reverseArray(long[] array, int size) {
        //switches around the indexes and stores as an array
        long[] arrayRev = new long[size];
        int sizeFor = size;
        for (int index = 0; index <= size-1; index++) {
            //first element of old array becomes last element of new array, etc.
            arrayRev[sizeFor - 1] = array[index];
            sizeFor = sizeFor - 1;
        }
        return arrayRev;
    }

    static long askP1() {
        //asks for the polynomial value at x = 1
        Scanner console = new Scanner(System.in); //initialize scanner
        System.out.print("What is the function value at x = 1, or P(1)?"); //asks the user for the function value at x = 1 (sum of the coefficients)
        String sumCoefficients = console.next(); //stores this number as a String sumCoefficients
        long sumOfCoefficients = polynomialGuess.isLongNotString2(sumCoefficients); //checks if sumCoefficients can be cast as a long (see class for more details)
        while (sumOfCoefficients == -1) { //if there is an error in the isLongNotString program
            System.out.print("What is the function value at x = 1, or P(1)?"); //reasks question
            String sumCoefficients2 = console.next();
            sumOfCoefficients = polynomialGuess.isLongNotString2(sumCoefficients2);
            //in essence, keeps asking the question until the user inputs a valid answer (a long)
        }
    return sumOfCoefficients;
    }

    static long askPN(long nN) {
        //asks for the polynomial value at x = N
        Scanner console = new Scanner(System.in); //initialize scanner
        System.out.print("What is the function value at x = " + nN + ", or P(" + nN + ")?");
        String nValue = console.next();
        long nnValue = polynomialGuess.isLongNotString2(nValue);
        while (nnValue == -1) { //if there is an error in the isLongNotString program
            System.out.print("What is the function value at x = " + nN + ", or P(" + nN + ")?"); //reasks question
            String nValue2 = console.next();
            nnValue = polynomialGuess.isLongNotString2(nValue2);
            //in essence, keeps asking the question until the user inputs a valid answer (a long)
        }
    return nnValue;
    }
}