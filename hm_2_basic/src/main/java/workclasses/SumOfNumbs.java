package workclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumbs {
    public static void toSum() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string: ");
        String str = reader.readLine();
        char[] mass = str.toCharArray();
        int a = 0;
        for (int i = 0; i< mass.length; i++) {
            if (Character.isDigit(mass[i])) {
                a += Integer.parseInt(String.valueOf(mass[i]));
            }
        }
        System.out.println("Sum of your numbers is: "+a);
        System.out.println();

    }

}
