package com.suarez;

import java.io.*;
import java.util.*;

public class electoralVotes {
    public static void main(String args[]) throws FileNotFoundException{
        Scanner input = new Scanner(new File("C:\\Users\\vrung\\IdeaProjects\\Beginning_Java\\src\\com\\suarez\\poll.txt"));
        int obama = 0;
        int mccain = 0;
        while(input.hasNextLine()) {
            String line = input.nextLine();
            Scanner elect = new Scanner(line);
            int count = 1;
            while(elect.hasNext()) {
                while (elect.hasNextInt()) {
                    if (count == 1) {
                        obama = obama + elect.nextInt();
                    }
                    else if (count == 2) {
                        mccain = mccain + elect.nextInt();
                    }
                    else {
                        String booboo = elect.next();
                    }
                    count++;
                    }
                String texty = elect.next();
                }
            }
        System.out.println("Obama: " + obama);
        System.out.print("McCain: " + mccain);
        }
    }
