package Conditional_loops;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int weight = sc.nextInt();
        int height = sc.nextInt();
        double w = weight * 0.45359237;
        double h = height * 0.0254;

        double BMI = w / (h*h);
        System.out.print(BMI);

    }
}
