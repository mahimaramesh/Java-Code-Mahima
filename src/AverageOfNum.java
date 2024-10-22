import java.util.Scanner;

public class AverageOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int sum = 0;
        int avg = 0;
        for(int i = 1; i <= range; i += 1){
            sum += i;
        }
        avg = sum / range;
        System.out.println("Average = " + avg);
    }
}
