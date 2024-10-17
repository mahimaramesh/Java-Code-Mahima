import java.util.Scanner;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rupee = sc.nextDouble();
        double dollar = 83.0;
        System.out.printf("%.3f", rupee / dollar);
    }
}
