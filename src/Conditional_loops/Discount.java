package Conditional_loops;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int LP = sc.nextInt();
        int SP = sc.nextInt();
        int discount_amt = LP - SP;
        System.out.println(discount_amt);

    }
}
