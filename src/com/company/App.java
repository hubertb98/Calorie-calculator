package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BasicMetabolism basicMetabolism = new BasicMetabolism();
        ActivityValue activityValue = new ActivityValue();

        System.out.println("Are you a woman (w) or man (m)?");
        String male = scan.nextLine();

        if(male.equals("m")) {
            basicMetabolism.PPMForMan();
            activityValue.calculateActivity();
        } else if(male.equals("w")) {
            basicMetabolism.PPMForWoman();
            activityValue.calculateActivity();
        } else {
            System.out.println("You entered wrong gender.");
        }
    }
}
