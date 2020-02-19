package com.suarez;

public class piApproximator {

    public static void main (String[] args) {
        double sum = 0;
        long i;
        for (i = 1; i <= 999999999; i++) {
            double term = 4.0/(2*i-1);
            sum = sum + (Math.pow(-1, i-1) * term );
            System.out.println(sum);
        }
    }
}
