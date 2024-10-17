import java.util.Scanner;

public class CountPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range1 = sc.nextInt();
        int range2 = sc.nextInt();
        int count = 0;
        for(int num = range1; num <= range2; num += 1){
            int digit = 0;
            int reverse = 0;
            int copy = num;
            while(copy != 0){
                digit = copy % 10;
                reverse = reverse * 10 + digit;
                copy = copy / 10;
            }
            if (reverse == num) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
