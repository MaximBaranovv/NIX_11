package workclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringDetection {
    public static void toDetectString() throws IOException {
        int counter[] = new int[256];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string: ");
        String str = reader.readLine();
        char[] mass = str.toCharArray();
        int a = 0;

        for (int i = 0; i < mass.length; i++) {

            if ((mass[i] >= 'a' && mass[i] <= 'z') || (mass[i] >= 'A' && mass[i] <= 'Z')) {
                a++;
            }
        }
        char[] mass2 = new char[a];
        char b = 0;
        for (int i = 0; i < mass.length; i++) {

            if ((mass[i] >= 'a' && mass[i] <= 'z') || (mass[i] >= 'A' && mass[i] <= 'Z') ) {
                mass2[b] = mass[i];
                b++;
            }
        }

        String str1 = String.valueOf(mass2);
        int length = str1.length();

        for (int i = 0; i < length; i++) {
            counter[(int) str1.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + " - " + counter[i]);
            }
        }
        System.out.println();

    }
}
