package com.suarez;

        import java.util.*;
        import java.io.*;

public class hoursFile {

    public static void main (String[] args) throws FileNotFoundException {
        Scanner input = new Scanner (new File("C:\\Users\\vrung\\IdeaProjects\\Beginning_Java\\src\\com\\suarez\\hours.txt"));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner person = new Scanner(line);
            String ID = "";
            String name = "";
            int count = 1;
            int size = 0;
            double sum = 0;
            while (person.hasNext()) {
                if (count == 1) {
                    ID = person.next();
                }
                else if (count == 2) {
                    name = person.next();
                }
                else {
                    while (person.hasNextDouble()) {
                        size++;
                        sum = sum + person.nextDouble();
                    }
                }
                count++;
            }
            //System.out.println (name + " (ID#" + ID + ") worked " + sum + " hours (" + sum/size + " hours/day)");
            System.out.print (name + " (ID#" + ID + ") worked ");
            System.out.printf("%.1f", sum);
            System.out.print(" hours (");
            System.out.printf("%.2f", sum/size);
            System.out.println(" hours/day)");
        }
    }
}
