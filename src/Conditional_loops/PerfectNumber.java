package Conditional_loops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = fun(num);
        if(num == result){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }

    }
    static int fun(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
