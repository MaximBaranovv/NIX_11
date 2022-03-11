package ua.com.alevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunStrings {
    public static void runProgram() {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            navigation();
            String line,str,subStr;
            int numberOne;
            int numberTwo;
            while (true) {
                line  = reader.readLine();
                switch (line) {
                    case "1":
                        System.out.println("Please enter a string");
                        System.out.print("-->");
                        str = reader.readLine();
                        System.out.println(ReverseStringUtil.Reverse(str));
                        System.out.println();
                        break;
                    case "2":
                        System.out.println("Please enter a string and a substring");
                        System.out.print("-->");
                        str = reader.readLine();
                        System.out.print("-->");
                        subStr = reader.readLine();
                        System.out.println(ReverseStringUtil.reverseBySupstring(str,subStr));
                        System.out.println();
                        break;
                    case "3":
                        System.out.println("Please enter a string and the first and the last symbols to reverse");
                        System.out.print("-->");
                        str = reader.readLine();
                        System.out.print("-->");
                        numberOne = Integer.parseInt(reader.readLine());
                        System.out.print("-->");
                        numberTwo = Integer.parseInt(reader.readLine());
                        System.out.println(ReverseStringUtil.ReverseById(str,numberOne,numberTwo));
                        System.out.println();
                        break;
                    case "4":
                        System.exit(0);
                        break;
                }
                navigation();
            }
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
        }
    }

    private static void navigation()
    {
        System.out.println("if you want to make a simple reverse of a string, please enter '1' ");
        System.out.println("if you want to make a reverse of a string by substring, please enter '2' ");
        System.out.println("if you want to make a reverse of a string by certain symbols, please enter '3' ");
        System.out.println("if you want to exit, please enter '4' ");
        System.out.print("-->");
    }
}
