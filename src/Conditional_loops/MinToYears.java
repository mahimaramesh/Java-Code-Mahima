package Conditional_loops;

import java.util.Scanner;

public class MinToYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = sc.nextDouble();
        double MinutesInYear = 60 * 24 * 365;

        long year = (long) (min / MinutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println("Year : " + year + " Days : " + days);
    }
}
