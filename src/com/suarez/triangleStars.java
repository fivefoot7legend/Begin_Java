package com.suarez;
/*
This program will print out 6 rows of stars, each row increasing by one star
Varun Gande
12/5/2019
Version 1
 */
public class triangleStars {
    public static void main(String[] args){
        starts(6); //defines the number of lines (which is also the number of stars on the last line)

    }
    public static void starts(int lines){
        for (int line = 1; line <= lines; line ++) {
            //for loop for the lines, where the number of lines is equal to the constant "lines" defined above
            for (int star=1; star <= line; star++) {
                System.out.print(" *");
            }
            //for loop within the line loop that prints the number of stars per row, which is equivalent to the line number it is on
            System.out.println(); //prints a new line for the line loop to act on the next line
        }
    }
}
