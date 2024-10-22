package Conditional_loops;

import java.util.Scanner;

public class CalculatenCrAndnPr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nCr = fact(n) / (fact(r) * fact(n-r));
        System.out.println(nCr);

        int nPr = fact(n) / fact(n-r);
        System.out.println(nPr);
    }
    static int fact(int num){
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
