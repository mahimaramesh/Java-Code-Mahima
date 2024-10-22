package Conditional_loops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = ((double) 1 /2) * base * height;
        System.out.println(area);
    }
}
