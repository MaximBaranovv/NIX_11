package ua.com.alevel;

import ua.com.alevel.gameoflife.GameOfLife;
import ua.com.alevel.knightandchessboard.CheckKnightsMoves;
import ua.com.alevel.stringisvalid.ValidString;
import ua.com.alevel.theareaoftriangle.CountAreaOfTriangle;
import ua.com.alevel.uniquenumbers.CountOfUniqueNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunMain {
    public static void runMain() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            methods();
            String line;
            while (true) {

                line = reader.readLine();
                switch (line) {
                    case "1":
                        CountOfUniqueNumbers.runCountOfUniqueNumbers();
                        break;
                    case "2":
                        CheckKnightsMoves.runCheckKnightsMoves();
                        break;
                    case "3":
                        CountAreaOfTriangle.runCountAreaOfTriangle();
                        break;
                    case "4":
                        ValidString.runValidString();
                        break;
                    case "5":
                        GameOfLife.runGameOfLife();
                        break;
                    case "6":
                        System.exit(0);
                        break;
                }
                methods();
            }
        }
    }
    public static void methods() {
        System.out.println("Run uniq numbers -- 1 ");
        System.out.println("Run knight and chessboard -- 2 ");
        System.out.println("Run the area of triangle -- 3 ");
        System.out.println("Run string is valid -- 4" );
        System.out.println("Run game of life -- 5");
        System.out.println("Exit -- 6");
        System.out.print("-->");
    }
}
