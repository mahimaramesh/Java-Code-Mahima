import java.util.Scanner;

public class SubtractSumAndPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 0;
        int sum = 0;
        int pro = 1;
        int copy = num;
        while(copy != 0){
            digit = copy % 10;
            sum += digit;
            pro *= digit;
            copy = copy / 10;
        }
        int result = pro - sum;
        System.out.println(result);
    }
}
