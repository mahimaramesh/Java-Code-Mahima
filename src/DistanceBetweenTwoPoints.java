import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1 = ");
        int x1 = sc.nextInt();
        System.out.print("x2 = ");
        int x2 =  sc.nextInt();
        System.out.print("y1 = ");
        int y1 = sc.nextInt();
        System.out.print("y2 = ");
        int y2 =  sc.nextInt();
        int num1 = x2 - x1;
        int num2 = y2 - y1;

        double distance = Math.sqrt((Math.pow(num1,2) + (Math.pow(num2,2))));
        System.out.printf("%.2f",distance);
    }
}
