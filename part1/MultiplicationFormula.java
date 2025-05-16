package part1;

import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        String a = scanner.nextLine();
        System.out.println("Give the second number: ");
        String b = scanner.nextLine();
        int aa = Integer.valueOf(a);
        int bb = Integer.valueOf(b);
        int c = aa * bb;
        System.out.println(aa + " * " + bb + " = " + c);
    }
}

