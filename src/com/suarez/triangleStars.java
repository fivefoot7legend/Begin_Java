package com.suarez;
/*
This program will print out 6 rows of stars, each row increasing by one star
Varun Gande
12/5/2019
Version 1
 */
public class triangleStars {
    public static void main(String[] args){
        starts(6);

    }
    public static void starts(int stars){
        for (int star = 1; star <= stars; star ++) {
            for (int i=1; i <= star; i++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
