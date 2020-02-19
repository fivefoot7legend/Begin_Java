package com.suarez;

import java.util.*;

public class approximatorGCF {

    public static void main(String[] args) {
        Random rand = new Random();
        double count = 0.00;
        double relprime = 0.00;
        while (count < 999999999) {
            int p1 = rand.nextInt(10000000) + 1;
            int p2 = rand.nextInt(10000000) + 1;
            count++;
            System.out.print((int) count + " (" + p1 + ", " + p2 + "), ");
            System.out.print("GCF = " + GCF(p1,p2) + ": Ratio = ");
            if (GCF(p1,p2) == 1) {
                relprime++;
            }
            System.out.print(relprime /count);
            double piApprox = Math.sqrt(6 * count / relprime);
            System.out.println(", pi = " + piApprox);
        }
    }

    public static int GCF(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return (GCF(b, a % b));
        }
    }

}
