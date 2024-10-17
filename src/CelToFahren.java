import java.util.Scanner;

public class CelToFahren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cel = sc.nextDouble();
        double fahren = 0;

        fahren = (cel * 9/5) + 32;
        System.out.printf("%.2f",fahren);
    }
}
