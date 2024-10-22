package Conditional_loops;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        int digit = 0;
        int count = 0;
        while(num != 0){
            digit = num % 10;
            if(digit == n)
              count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
