package com.suarez;

public class receiptTaxTip {

    public static void main (String[]  args) {
        double subTotal=38.00+40.00+30.00;
        double tax=0.08*subTotal;
        double tip=0.15*(subTotal+tax);
        System.out.printf("Subtotal ($): %7.2f", subTotal);
        System.out.println();
        System.out.printf("Tax ($): %10.2f", tax);
        System.out.println();
        System.out.printf("Tip ($): %11.2f", tip);
        System.out.println();
        System.out.printf("Total ($): %10.2f", (tax+tip+subTotal));
    }
}
