package part1;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        String a = scanner.nextLine();
        int aa = Integer.valueOf(a);
        System.out.println("Give the second number:");
        String b = scanner.nextLine();
        int bb = Integer.valueOf(b);
        int sum = aa + bb;
        int subtraction = aa - bb;
        int multi = aa * bb;
        double division = aa * 1.0 / bb;
        System.out.println(aa + " + " + bb + " = " + sum);
        System.out.println(aa + " - " + bb + " = " + subtraction);
        System.out.println(aa + " * " + bb + " = " + multi);
        System.out.println(aa + " / " + bb + " = " + division);
    }
}
