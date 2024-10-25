package Problems;

import java.util.Scanner;

public class TimeFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int mul = num1 * num2;
        if(mul < 12){
            System.out.println(mul);
        }
        else{
            System.out.println(mul - 12);
        }
    }
}
