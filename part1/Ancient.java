package part1;

import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        String a = scan.nextLine();
        int aa = Integer.valueOf(a);
        if (aa < 2015){
            System.out.println("Ancient history!");
        }
    }
}

