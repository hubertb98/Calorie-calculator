package com.company;

import java.util.Locale;
import java.util.Scanner;

public class ActivityValue {
    public double activity;

    BasicMetabolism bm = new BasicMetabolism();
    double ppm = bm.ppm;
    double lose;
    double gain = ppm * 1.1;

    public double calculateActivity() {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Praca siedząca, brak dodatkowej aktywności fizycznej\t\t\t1.2");
        System.out.println("Praca niefizyczna, mało aktywny tryb życia\t\t\t\t\t\t1.4");
        System.out.println("Lekka praca fizyczna, ćwiczenia 3-4 razy (ok.5h) w tygodniu\t\t1.6");
        System.out.println("Praca fizyczna, ćwiczenia od  5razy (ok. 7h) w tygodniu\t\t\t1.8");
        System.out.println("Praca fizyczna ciężka, ćwiczenia 7 razy w tygodniu\t\t\t\t2.0");
        System.out.print("\nEnter your activity: ");
        activity = scan.nextDouble();
        if (activity <= 2.0 && activity >= 1.2){
            while (activity <= 2.0 && activity >= 1.2) {
                System.out.println("To maintain weight you need: " + ppm * activity);
                System.out.println("************************************\nContinue by clicking enter");
                scan.nextLine();
                System.out.print("Do you want to gain or lose weight? \nEnter: gain / lose");
                String changeWeight = scan.nextLine();
                if(changeWeight.equals("lose")) {
                    lose = ppm * activity* 0.9;
                    System.out.printf("If you want to lose weight you need %.0f kcal", lose);
                } else if(changeWeight.equals("gain")){
                    gain = ppm * activity * 1.1;
                    System.out.printf("If you want to lose weight you need %.0f kcal", gain);
                } else {
                    System.out.println("You entered the wrong value.");
                }
            }
        }
    return activity;
    }

}
