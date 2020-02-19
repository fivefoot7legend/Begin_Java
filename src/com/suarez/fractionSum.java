package com.suarez;

import java.util.*;

public class fractionSum {

    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What value of n would you like to use?");
        int n = console.nextInt();
        System.out.print("1/1");
        double s = 1.00;
        for(int i=2; i<=n; i++) {
            System.out.print("+");
            System.out.print("1/" + i);
            s = s+ 1.0/i;
        }
        System.out.println();
        System.out.printf("=%.4f", s);
    }
}
