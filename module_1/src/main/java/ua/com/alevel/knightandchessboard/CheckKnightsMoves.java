package ua.com.alevel.knightandchessboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class CheckKnightsMoves {
    static int gorizInt = 0;
    static int temp2 = 0;

    public static void runCheckKnightsMoves () throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please enter coordinates of the knight (A-H, 1-8): ");
            System.out.print("-->");
            String firstGoriz = reader.readLine();
            String goriz = firstGoriz.toUpperCase();
            setInt(goriz);
            temp2 = gorizInt;
            System.out.print("-->");
            int vertikal = Integer.parseInt(reader.readLine());
            String[][] array = new String[8][8];
            int temp = vertikal;
            vertikal = 8 - vertikal;
            int count =8;
            if (gorizInt > 7 || gorizInt < 0 || vertikal > 7 || vertikal < 0) {
                System.out.println("Sorry this knight`s position is impossible");
                System.out.println();
               return;
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[vertikal][gorizInt] = " X ";
                    array[i][j] = "|_|";
                    continue;
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.print(count);
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
                count--;
            }
            count =8;
            System.out.println("  A  B  C  D  E  F  G  H ");
            gorizInt = 0;
            System.out.println("Please enter coordinates of the where you want to move it (A-H, 1-8): ");
            System.out.print("-->");
            String firstProverka = reader.readLine();
            String proverka = firstProverka.toUpperCase(Locale.ROOT);
            proverka.toUpperCase();
            System.out.print("-->");
            int vertikal2 = Integer.parseInt(reader.readLine());
            setInt(proverka);
            if (vertikal2 > 9 || vertikal2 < 0 || gorizInt > 9 || gorizInt < 0) {
                System.out.println("Sorry this move is impossible");
                System.out.println();
                return;
            }
            if (gorizInt == temp2 || gorizInt == temp2 + 3 || gorizInt == temp2 - 3) {
                System.out.println("Sorry this move is impossible");
                System.out.println();
                return;
            }
            if (gorizInt == temp2+2&&vertikal2 == temp + 2||gorizInt == temp2-2&&vertikal2 == temp - 2||gorizInt == temp2+2&&vertikal2 == temp - 2||gorizInt == temp2-2&&vertikal2 == temp + 2) {
                  System.out.println("Sorry this move is impossible");
                  System.out.println();
                return;
            }
            if (vertikal2 == temp + 3 || vertikal2 == temp - 3) {
                System.out.println("Sorry this move is impossible");
                System.out.println();
                return;
            }
            vertikal2 = 8 - vertikal2;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[vertikal2][gorizInt] = " X ";
                    array[i][j] = "|_|";
                    continue;
                }
            }
            System.out.println("Move is valid!");
            for (int i = 0; i < array.length; i++) {
                System.out.print(count);
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
                count--;
            }
            System.out.println("  A  B  C  D  E  F  G  H ");
            System.out.print("If you want to continue, press 'y' and 'n' if not: ");
            String choice = reader.readLine();
            if (choice.charAt(0) == 'y')
                continue;
            else
                break;
        }

    }

    public static void setInt(String stroka) {
        switch (stroka) {
            case "A":
                gorizInt = 0;
                break;
            case "B":
                gorizInt = 1;
                break;
            case "C":
                gorizInt = 2;
                break;
            case "D":
                gorizInt = 3;
                break;
            case "E":
                gorizInt = 4;
                break;
            case "F":
                gorizInt = 5;
                break;
            case "G":
                gorizInt = 6;
                break;
            case "H":
                gorizInt = 7;
                break;
        }
    }
}

