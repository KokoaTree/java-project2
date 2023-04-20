package week1;

import java.util.Scanner;

public class ScannerStrEx {
    public static void inputStringsAndPlus() {
        Scanner str = new Scanner(System.in);
        String isString = str.next();
        String isString2 = str.next();

        System.out.println(isString + " " + isString2);
    }
}
