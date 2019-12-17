package com.suarez;
/*
This program will calculate the area of a circle given the radius
Varun Gande
12/4/2019
Version 1
 */
public class AreaOfCircle {

    public static void main(String[] args) {
        final double pi=3.14;
        double area;
        double radius=67.66666666;
        area = radius * radius * pi;
        System.out.println("The area of the circle with radius "+ radius+" inches is "+ area+" square inches.");
    }
}
