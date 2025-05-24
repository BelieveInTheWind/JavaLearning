package part1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        int n = Integer.valueOf(scan.nextLine());
        if (n % 4 != 0){
            System.out.println("The year is not a leap year.");
        } else if (n % 100 == 0) {
            if (n % 400 != 0){
                System.out.println("The year is not a leap year.");
            } else {
                System.out.println("The year is a leap year.");
            }
        } else {
            System.out.println("The year is a leap year.");
        }
    }
}
