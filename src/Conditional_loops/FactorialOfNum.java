package Conditional_loops;

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long fact = 1;
        for(int i = 1; i <= num; i += 1){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
