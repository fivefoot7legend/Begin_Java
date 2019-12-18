package com.suarez;
/*
This program will calculate the area of a circle given the radius
Varun Gande
12/4/2019
Version 1
 */
public class AreaOfCircle {

    public static void main(String[] args) {
        final double pi=3.14; //specifies the value of pi
        double area; //defines area as a variable
        double radius=67.66666666; //defines radius and its value
        area = radius * radius * pi; //equation for the area of the circle
        System.out.println("The area of the circle with radius "+ radius+" inches is "+ area+" square inches.");
        //prints out a statement with the radius and area of the circle
    }
}
