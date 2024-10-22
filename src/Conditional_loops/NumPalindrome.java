package Conditional_loops;

import java.util.Scanner;

public class NumPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = isPalindrome(num);
        if(res == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
    static int isPalindrome(int n){
        int digit = 0;
        int palin = 0;
        while(n != 0){
            digit = n % 10;
            palin = palin * 10 + digit;
            n /= 10;
        }
        return palin;
    }
}
