package com.suarez;
/*
This program will print out 6 rows of 10 stars
Varun Gande
12/5/2019
Version 1
 */
public class StarsProgram {
    public static void main(String[] args){
        starts(6, 10);
    }
    static void starts(int lines, int stars){
        int star;
        for(int line = 1; line <= lines ; line ++){
            for(star = 1; star <= stars; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
