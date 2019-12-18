package com.suarez;
/*
This program will print out 6 rows of 10 stars
Varun Gande
12/5/2019
Version 1
 */
public class StarsProgram {
    public static void main(String[] args){
        starts(6, 10); //declares the number of rows and number of stars per row
    }
    static void starts(int lines, int stars) { //defines two variables (lines and stars)
        int star; //defines a variable star which will be acted upon the for loop
        for(int line = 1; line <= lines ; line ++){
            //for loop for the lines, where the number of lines is equal to the constant "lines" defined above
            for(star = 1; star <= stars; star++){
                System.out.print("*");
            }
            //for loop within the line loop that prints the stars per row, where the number of stars is equal to the constant "stars" defined above
            System.out.println(); //prints a new line for the line loop to act on for the next line
        }
    }
}
