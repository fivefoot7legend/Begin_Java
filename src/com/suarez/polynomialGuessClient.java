package com.suarez;

import java.util.*;
/*
If you have a polynomial P(x) with non-negative integer coefficients and exponents, how many queries would you need
to determine P(x) exactly.

The answer. Two. The first is P(1), and if we call N = P(1) + some positive integer, then the second query is P(N).

Shocking, right? I'll explain.

The crucial part is that the polynomial has non-negative integer coefficients and exponents. This allows us to use
modular arithmetic and a bit of number theory to figure out P(x). We can let P(X) be as follows:

P(x) = a + bx + cx^2 + ... (where a, b, c, ... can either be 0 or a positive integer).

Note that P(1) = a + b + c + ... = sum of the coefficients. P(1) + any positive integer will be larger than any single
coefficient. If we let N be that number (which will be pretty large), we can pose our second query. We ask what P(N) is
(which could be a gigantic value in some cases) which gives us a number (we can call NValue) of the form:

NValue = a + bN + cN^2 + ... = a + N(b + cN + ...)

Because N is a large number, we can compute a easily by computing NValue mod N. Since the other terms of the equation
are divisible by N, their remainder upon division by N will be 0. We can set a new Nvalue to be (Nvalue - a)/N and get
a new equation:

NValue new = (Nvalue - a) / N = b + cN + ... = b + N(c + ...)

If we compute modulus again, we can get b. We repeat this process until we have al the coefficients and stop once we get
a Nvalue new of 0. We can store our coefficients in an array and display the polynomial.

This program does exactly that. It asks for the same two queries and displays the polynomial. If by chance you want to
know if a non-negative-integer-coefficient-and-exponent polynomial exists, you can put your own inputs and the program
will tell you if a polynomial exists or not and if so, what that polynomial actually is.

Varun Gande
February 18, 2020
Final Project
Version 1
 */

public class polynomialGuessClient {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in); //initialize the scanner
            polynomialGuess.showExample(); //displays examples of acceptable polynomials for the program
            polynomialGuess.showWrongExample(); //displays an example of a non-acceptable polynomial
            polynomialGuess.delay(5000); //cute little delay
            polynomialGuess.ellipsis(); //cute little ellipsis (3 dots)
            long sumOfCoefficients = polynomialGuess.askP1(); //asks for function value at 1 and stores as a long
            System.out.println("P(1) = " + sumOfCoefficients); //displays the input for the user
            polynomialGuess.delay(1000); //more cute delay
            polynomialGuess.ellipsis(); //more cute ellipsis (ok Varun you're being extra)
            polynomialGuess.delay(2000); //whaddya know, another delay
            System.out.println("Choose an integer larger than " + sumOfCoefficients + ". Call this number N. What would you like N to be?"); //asks the user for a number larger than P(1)
            polynomialGuess.delay(1000); //yep, you know what this is (spoiler: AnOtHeR DeLaY)
            System.out.print("(And by the way, I will ask for the function value at N, so don't make N obscenely large.)"); //because the long variable has a numerical limit, it reminds the user not to choose a number super duper large
            String N = console.next(); //stores this value as a string
            long nN = polynomialGuess.isLongNotString2(N); //checks if value can be cast as a long
            if (nN <= sumOfCoefficients) { //in the case where the user sets N to be a value <= sumOfCoefficients, we go through the error process
                nN = -1;
            }
            while (nN == -1) { //error process
                System.err.print("Try again! ");
                System.out.print("Make sure N is an integer value larger than " + sumOfCoefficients + ". ");
                System.out.println("Again, don't make N obscenely large.");
                String N2 = console.next();
                nN = polynomialGuess.isLongNotString2(N2);
                if (nN <= sumOfCoefficients) {
                    nN = -1;
                }
                //in essence, keeps asking the user until they provide a value that satisfies the criteria we gave
            }
            long nnValue = polynomialGuess.askPN(nN); //asks for function value at N and stores as long
            int count = 0; //sets a counter to determine how much memory to allocate for the array (size of the array with the coefficients)
            long nnValueWhile = nnValue; //creates a dummy variable to use for the counter while not modifying nnValue
            long nnValueValue = nnValue;
            while (nnValueWhile != 0) {
                long coefficientSubN = nnValueWhile % nN;
                nnValueWhile = (nnValueWhile - coefficientSubN) / nN;
                count++;
                //crux of the program
            }
            long[] coefficients = new long[count]; //sets up the array
            System.out.println("P(1) = " + sumOfCoefficients); //displays P(1) for the user
            System.out.println("P(" + nN + ") = " + nnValue); //displays N and P(N) for the user
            polynomialGuess.delay(1000); //DeLaY
            polynomialGuess.ellipsis();//ElLiPsIs
            System.out.println("Okay. Let me try to guess your polynomial."); //simulates Java thinking
            polynomialGuess.delay(5000);
            System.out.print("Finalizing");
            polynomialGuess.ellipsisSameLine(); //puts an ellipsis on the same line as "Finalizing"
            System.out.println();
            while (nnValue != 0) {
                for (int index = 0; index <= count - 1; index++) {
                    long coefficientSubN = nnValue % nN;
                    coefficients[index] = coefficientSubN;
                    nnValue = (nnValue - coefficientSubN) / nN;
                }
                //now we perform the crux of the program on nnValue to determine the values in the array
            }
            long sumOfArray = polynomialGuess.sumArray(coefficients, coefficients.length); //if no polynomial satisfies the inputs, the array will be infinitely large, so we define a variable for the sum of the array elements
            //System.out.print(sumOfArray + "," + sumOfCoefficients);
            if (sumOfArray != sumOfCoefficients) { //the sum of the array will be greater than the sum of the coefficients in the case of an undefined polynomial
                System.err.print("The inputs you gave do not produce a possible polynomial.");
                System.exit(-1); //exits the program
            }
            //System.out.println(Arrays.toString(coefficients));
            long[] coefficientsRev = polynomialGuess.reverseArray(coefficients, count);
            //switches the array around for convenience (higher exponent powers are displayed before lower ones/constant)

            //System.out.println(Arrays.toString(polynomialGuess.reverseArray(coefficients, count))); (checks if the reverse array displays properly)
            System.out.print("Your polynomial is: P(x) = ");
            if (sumOfCoefficients == 0 && nnValueValue == 0) {
                System.out.print("0");
                System.exit(0);
            } else {
                for (int index = 0; index <= count - 2; index++) {
                    int indexAdj = count - index - 1;
                    /*
                    This for loop is for convention in displaying the polynomial. Basically, we want to change the way we
                    display a term when the coefficient and/or exponent is 0 and 1. For terms with a coefficient of 0, we
                    do not display that term. For terms with a coefficient of 1, we leave out the coefficient and just
                    display "x^5" or "x^3", for example. For terms with an exponent of 0 (a constant), we just display the
                    coefficient. For terms with an exponent of 1, we display coefficient + "x".
                     */
                    if (coefficientsRev[index] == 1 && indexAdj != 1) {
                        System.out.print("x^" + indexAdj);
                    } else if (coefficientsRev[index] == 0) {
                        System.out.print("");
                    } else if (coefficientsRev[index] != 1 && indexAdj == 1) {
                        System.out.print(coefficientsRev[index] + "x");
                    } else if (coefficientsRev[index] == 1 && indexAdj == 1) {
                        System.out.print("x");
                    } else {
                        System.out.print(coefficientsRev[index] + "x^" + indexAdj);
                    }
                    if (coefficientsRev[index + 1] != 0) {
                        //prints a plus sign if the next term exists and is not 0
                        System.out.print(" + ");
                    }
                }
            }
                if (coefficientsRev[count-1] != 0) {
                    //we print the constant term if it is not 0, and do not display a plus sign after that
                    System.out.print(coefficientsRev[count-1]);
                }
            }
        }
