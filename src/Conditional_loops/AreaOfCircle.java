package Conditional_loops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = Math.PI * (radius * radius);
        System.out.printf("%.2f" , area);
    }
}
