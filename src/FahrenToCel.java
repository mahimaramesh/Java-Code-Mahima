import java.util.Scanner;

public class FahrenToCel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahren = sc.nextDouble();
        double cel = 0;

        cel = (fahren - 32) * 5/9;
        System.out.printf("Celsius is %.2f",cel);
    }
}
