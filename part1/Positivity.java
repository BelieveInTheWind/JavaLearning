package part1;

import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number: ");
        String a = scan.nextLine();
        int aa = Integer.valueOf(a);
        if (aa > 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
