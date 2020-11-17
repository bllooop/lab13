package lab13;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        PassTest pt = new PassTest();
        System.out.println(pt.isValidPassword(str));
    }
}
