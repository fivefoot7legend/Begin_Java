package com.suarez;

import java.util.*;

public class celsiusFahrenheit {
/*
This program will convert Fahrenheit to Celsius for certain data
 */
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in); //initialize scanner

        System.out.print("What's the temperature outside (in Fahrenheit)?");
        int fahTemp = console.nextInt(); //next int is temperature in F

        double celsiusTemp = (fahTemp-32)/1.8; //conversion from F to C
        System.out.printf("It is %.2f", celsiusTemp);
        System.out.print(" degrees Celsius outside! Have a nice day!");
        }
    }
