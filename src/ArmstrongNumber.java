import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copy = num;
        int digit = 0;
        int sum  = 0;
        int count = 0;
        while(copy != 0){
            digit = copy % 10;
            count++;
            copy = copy / 10;
        }
        copy = num;
        while(copy != 0) {
            digit = copy % 10;
            sum = (int) (sum + Math.pow(digit, count));
            copy = copy / 10;
        }
        if(num == sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
