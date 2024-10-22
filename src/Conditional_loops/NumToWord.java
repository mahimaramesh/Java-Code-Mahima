package Conditional_loops;

import java.util.Scanner;

public class NumToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int copy = num;
        while(copy != 0){
            copy = copy/10;
            count = count+1;
        }
        int pow = 1;
        for(int i = 1; i < count; i += 1){
            pow = pow * 10;
        }
        while(pow != 0) {
            int temp = num / pow;
            switch (temp) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                default:
                    System.out.print("Nine ");
                    break;
            }
            num =num % pow;
            pow = pow / 10;
        }
    }
}
