package Conditional_loops;

import java.util.Scanner;

public class HappyNumber {
    public static int checkHappy(int num){
        int rem = 0;
        int square = 0;
        int sum = 0;
        while(num != 0){
            rem = num % 10;
            square = rem*rem;
            sum = sum + square;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int value = checkHappy(num);
        while(value!=1 && value!=4){
            value = checkHappy(value);
        }

        if(value == 1){
            System.out.println("Happy number");
        }
        else{
            System.out.println("Not a Happy Number");
        }
    }
}
