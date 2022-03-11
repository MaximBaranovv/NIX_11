package ua.com.alevel.gameoflife;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameOfLife{
    public static void runGameOfLife() throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int iterations = 65;
            System.out.println("Enter height");
            System.out.print("-->");
            int n = Integer.parseInt(reader.readLine());
            System.out.println("Enter width");
            System.out.print("-->");
            int str_length = Integer.parseInt(reader.readLine());
            Random r = new Random();
            String[] massiv = new String[n];
            for (int i = 0; i < n; i++) {
                StringBuilder builder = new StringBuilder();
                for (int j = 0; j < str_length; j++) {
                    char code = (char) (r.nextInt(2) + 34);
                    builder.append(Character.toString(code));
                }
                massiv[i] = builder.toString();
            }
            for (int i = 0; i < iterations; i++) {
                System.out.println();
                print(massiv);
                massiv = gameRealization(massiv);
            }
            System.out.print("If you want to continue, press 'y' and 'n' if not: ");
            String choice = reader.readLine();
            if (choice.charAt(0) == 'y')
                continue;
            else
                break;
        }
    }

    public static String[] gameRealization(String[] dish){
        String[] stroka2= new String[dish.length];
        for(int row= 0;row < dish.length;row++){
            stroka2[row]= "";
            for(int i= 0;i < dish[row].length();i++){
                String priv,current,next= "";
                if(i == 0){
                    priv= (row == 0) ? null : dish[row - 1].substring(i,
                            i + 2);
                    current= dish[row].substring(i + 1, i + 2);
                    next= (row == dish.length - 1) ? null : dish[row + 1]
                            .substring(i, i + 2);
                }else if(i == dish[row].length() - 1){
                    priv= (row == 0) ? null : dish[row - 1].substring(i - 1,
                            i + 1);
                    current= dish[row].substring(i - 1, i);
                    next= (row == dish.length - 1) ? null : dish[row + 1]
                            .substring(i - 1, i + 1);
                }else{
                    priv= (row == 0) ? null : dish[row - 1].substring(i - 1,
                            i + 2);
                    current= dish[row].substring(i - 1, i)
                            + dish[row].substring(i + 1, i + 2);
                    next= (row == dish.length - 1) ? null : dish[row + 1]
                            .substring(i - 1, i + 2);
                }
                int sosedi= getNeib(priv, current, next);
                if(sosedi < 2 || sosedi > 3){
                    stroka2[row]+= "-";
                }else if(sosedi == 3){
                    stroka2[row]+= "#";
                }else{
                    stroka2[row]+= dish[row].charAt(i);
                }
            }
        }
        return stroka2;
    }

    public static int getNeib(String above, String same, String below){
        int count= 0;
        if(above != null){
            for(char x: above.toCharArray()){
                if(x == '#') count++;
            }
        }
        for(char x: same.toCharArray()){
            if(x == '#') count++;
        }
        if(below != null){
            for(char x: below.toCharArray()){
                if(x == '#') count++;
            }
        }
        return count;
    }

    public static void print(String[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}