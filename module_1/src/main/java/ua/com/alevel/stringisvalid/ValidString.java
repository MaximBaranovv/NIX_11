package ua.com.alevel.stringisvalid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class ValidString {
    public static void runValidString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Please enter a string ");
            System.out.print("-->");
            String line = reader.readLine();
            if(checkIfValid(line)){
                System.out.println("String is valid!");
                System.out.println();
            }
            else
                System.out.println("String is not valid");
            System.out.print("If you want to continue, press 'y' and 'n' if not: ");
            String choice = reader.readLine();
            if (choice.charAt(0) == 'y')
                continue;
            else
                break;
        }
    }
     public static boolean checkIfValid(String str) throws IOException {
             String stroka = str;
             Deque<Character> characterStack = new ArrayDeque<Character>();

             for (int i = 0; i < stroka.length(); i++) {
                 char strokaChar = stroka.charAt(i);

                 if (strokaChar == '[' || strokaChar == '{' || strokaChar == '(') {
                     characterStack.push(strokaChar);
                 }
                 char temp;
                 if (strokaChar == ']') {
                     temp = characterStack.pop();
                     if (temp == '(' || temp == '{') {
                         return false;
                     }
                 }
                 if (strokaChar == ')') {
                     temp = characterStack.pop();

                     if (temp == '{' || temp == '[') {
                         return false;
                     }
                 }
                 if (strokaChar == '}') {
                     temp = characterStack.pop();

                     if (temp == '(' || temp == '[') {
                         return false;
                     }
                 }
             }
             return characterStack.isEmpty();
     }
}
