package ua.com.alevel.uniquenumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfUniqueNumbers {
    public static void runCountOfUniqueNumbers() throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the string");
            System.out.print("-->");
            String str = reader.readLine();
            char[] mass = str.toCharArray();
            int key = 0;

            for (int i = 0; i < mass.length; i++) {
                if (mass[i] == ' ') {
                    key++;
                    break;
                }
            }
            if (key == 0) {
                int res = 1;

                for (int i = 1; i < mass.length; i++) {
                    int j = 0;
                    for (j = 0; j < i; j++)
                        if (mass[i] == mass[j])
                            break;
                    if (i == j)
                        res++;
                }
                System.out.println("Count of uniq characters is: " + res);

            } else {
                int[] arrayInt = new int[mass.length];
                for (int i = 0; i < mass.length; i++) {
                    if (mass[i] == ' ')
                        continue;
                    arrayInt[i] = Character.getNumericValue(mass[i]);
                }
                String[] strArray = str.split(" ");
                int iter = arrayInt.length;

                int res = 1;

                for (int i = 1; i < iter; i++) {
                    int j = 0;
                    for (j = 0; j < i; j++)
                        if (arrayInt[i] == arrayInt[j])
                            break;
                    if (i == j)
                        res++;
                }
                for (int i = 0; i < mass.length; i++) {
                    if (mass[i] == ' ') {
                        res--;
                        break;
                    }
                }
                System.out.println("Count of uniq characters is: " + res);
            }
            System.out.print("If you want to continue, press 'y' and 'n' if not: ");
            String choice = reader.readLine();
            if (choice.charAt(0) == 'y')
                continue;
            else
                break;

        }
    }
}
