import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int prev = 0;
        int curr = 0;
        int next = 1;
        System.out.print(curr + " ");
        System.out.print(next + " ");

        for(int i = 2; i < range; i += 1){
            prev = curr;
            curr = next;
            next = prev + curr;
            System.out.print(next + " ");
        }
    }
}
