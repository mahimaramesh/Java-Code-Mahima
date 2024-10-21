import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int prev = 0;
        int curr = 1;
        int next;
        System.out.print(prev + " ");
        System.out.print(curr + " ");

        for(int i = 2; i < range; i += 1){
            next = prev + curr;
            System.out.print(next + " ");
            prev = curr;
            curr = next;
        }
    }
}
