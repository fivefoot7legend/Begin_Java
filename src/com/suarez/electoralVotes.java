package com.suarez;

import java.io.*;
import java.util.*;

public class electoralVotes {
    public static void main(String args[]) throws FileNotFoundException{
        Scanner input = new Scanner(new File("C:\\Users\\vrung\\IdeaProjects\\Beginning_Java\\src\\com\\suarez\\poll.txt")); //this scanner will read the file
        int obama = 0; //initialize sum of obama votes
        int mccain = 0; //initialize sum of mccain votes
        while(input.hasNextLine()) {
            String line = input.nextLine();
            Scanner elect = new Scanner(line); //this scanner will read each line
            int count = 1; //counter to determine where to allocate each vote
            while(elect.hasNext()) {
                while (elect.hasNextInt()) {
                    if (count == 1) {
                        obama = obama + elect.nextInt(); //add to obama sum
                    }
                    else if (count == 2) {
                        mccain = mccain + elect.nextInt(); //add to mccain sum
                    }
                    else {
                        String booboo = elect.next(); //consume
                    }
                    count++; //count up
                    }
                String texty = elect.next(); //consume
                }
            }
        System.out.println("Obama: " + obama);
        System.out.print("McCain: " + mccain);
        }
    }
