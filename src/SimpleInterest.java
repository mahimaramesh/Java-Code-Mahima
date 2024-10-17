import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principle = sc.nextInt();
        double numofyears = sc.nextInt();
        double interest = sc.nextDouble();
        double si = 0;
        si = principle * numofyears * interest / 100;
        System.out.printf("%.2f",si);
    }
}
