package Conditional_loops;

import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNeg = 0;
        int sumEvenPos = 0;
        int sumOddPos = 0;

        while (true){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(num < 0)
                sumNeg += num;
            else if(num > 0 && num % 2 == 0){
                sumEvenPos += num;
            }
            else{
                sumOddPos += num;
            }
        }
        System.out.println("Sum of negative : " + sumNeg);
        System.out.println("Sum of even pos : " + sumEvenPos);
        System.out.println("Sum of odd pos : " + sumOddPos);
    }
}