package part1;

import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        String a = scan.nextLine();
        int aa = Integer.valueOf(a);
        if (aa >= 18){
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
