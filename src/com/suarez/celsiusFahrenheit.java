package com.suarez;

import java.util.*;

public class celsiusFahrenheit {
/*
This program will convert Fahrenheit to Celsius for certain data
 */
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("What's the temperature outside (in Fahrenheit)?");
        int fahTemp = console.nextInt();

        double celsiusTemp = (fahTemp-32)/1.8;
        System.out.printf("It is %.2f", celsiusTemp);
        System.out.print(" degrees Celsius outside! Have a nice day!");
        }
    }
