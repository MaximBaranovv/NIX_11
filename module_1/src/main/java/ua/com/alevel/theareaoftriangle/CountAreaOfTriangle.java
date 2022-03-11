package ua.com.alevel.theareaoftriangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountAreaOfTriangle {
    public static void runCountAreaOfTriangle () throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter x1 of point A: ");
            System.out.print("-->x1 ");
            int x1 = Integer.parseInt(reader.readLine());
            System.out.println("Enter y1 of point A: ");
            System.out.print("-->y1 ");
            int y1 = Integer.parseInt(reader.readLine());
            System.out.println("Enter x2 of point B:");
            System.out.print("-->x2 ");
            int x2 = Integer.parseInt(reader.readLine());
            System.out.println("Enter y1 of point B:");
            System.out.print("-->y2 ");
            int y2 = Integer.parseInt(reader.readLine());
            ;
            System.out.println("Enter x3 of point C: ");
            System.out.print("-->x3 ");
            int x3 = Integer.parseInt(reader.readLine());
            System.out.println("Enter y3 of point C: ");
            System.out.print("-->y3 ");
            int y3 = Integer.parseInt(reader.readLine());
            System.out.println();
            double f1 = (x1 - x3);
            double f2 = (x2 - x3);
            double f3 = (y1 - y3);
            double f4 = (y2 - y3);
            double f5 = Math.abs(((f1 * f4) - (f2 * f3)) * 0.5);
            System.out.println("The area of triangle is " + f5);
            System.out.print("If you want to continue, press 'y' and 'n' if not: ");
            String choice = reader.readLine();
            if (choice.charAt(0) == 'y')
                continue;
            else
                break;
        }
    }
}
