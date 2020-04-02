package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

public class BasicMetabolism {
    public double weight;
    public double height;
    public int age;
    public double ppm;
    Scanner scan = new Scanner(System.in);

    public double PPMForMan() {
        System.out.print("Please enter your weight: ");
        weight = scan.nextDouble();
        System.out.print("Please enter your height in cm: ");
        height = scan.nextDouble();
        System.out.print("Please enter your age: ");
        age = scan.nextInt();
        ppm = (10 * weight) + (6.25 * height) - (5 * age) + 5;
        System.out.printf("Twój spoczynkowy wydatek energetyczny wynosi %.0f kcal \n\n", ppm);
        return ppm;
    }

    public double PPMForWoman() {
        System.out.print("Please enter your weight: ");
        weight = scan.nextDouble();
        System.out.print("Please enter your height in cm: ");
        height = scan.nextDouble();
        System.out.print("Please enter your age: ");
        age = scan.nextInt();
        ppm = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        System.out.printf("Twój spoczynkowy wydatek energetyczny wynosi %.0f kcal \n\n", ppm);
        return ppm;
    }

}