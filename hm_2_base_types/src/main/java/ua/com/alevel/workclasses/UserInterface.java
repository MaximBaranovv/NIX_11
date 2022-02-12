package ua.com.alevel.workclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInterface {
    public static void programRun() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                printChoices();
                String str = bufferedReader.readLine();
                switch (str) {
                    case "1" ->  SumOfNumbs.toSum();
                    case "2" ->  StringDetection.toDetectString();
                    case "3" ->  TimeCalculation.toCalculateTime();
                    case "4" ->  System.exit(0);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void printChoices () {
        System.out.println();
        System.out.println("Press 1 if you want to calculate numbers in the a string ");
        System.out.println("Press 2 if you want to detect characters in the string ");
        System.out.println("Press 3 if you want to calculate the end time of the lesson ");
        System.out.println("Press 4 if you want to exit ");
        System.out.print("> ");
    }
}