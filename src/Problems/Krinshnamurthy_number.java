package Problems;

import java.util.Scanner;

public class Krinshnamurthy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int krish = factorial(temp);
        if(krish == num){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    static int factorial(int n) {
        int result  = 0;
        while (n != 0) {
            int digit = n % 10;
            int res = fact(digit);
            result += res;
            n /= 10;
        }
        return result;
    }

    static int fact(int a){
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }
}
