import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = 2 * Math.PI * radius;
        System.out.printf("%.2f" , area);
    }
}
