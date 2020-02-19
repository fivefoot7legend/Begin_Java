package com.suarez;

import java.io.*;
import java.util.*;

public class readFile {
    public static void main(String args[]) throws FileNotFoundException{
        //try using a ~ for getting a relative path
        Scanner input = new Scanner(new File("C:\\Users\\vrung\\IdeaProjects\\Beginning_Java\\src\\com\\suarez\\poll.txt"));
        while(input.hasNextInt()){
            if (input.hasNextInt())
            {
                int test = input.nextInt();
                System.out.println(test);
            }
            else {
                System.out.println("nope");
                String text2 = input.next();
            }
        }
    }
}
