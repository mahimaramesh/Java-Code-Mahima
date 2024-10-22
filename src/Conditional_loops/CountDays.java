package Conditional_loops;

import java.util.Scanner;

public class CountDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int count = 0;
        if((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)){
            for (int i = 1; i < 31; i++) {
                if(i % 2 == 0){
                    count++;
                }
            }
        }
        else if(month == 2){
            for (int i = 1; i < 29; i++) {
                if(i % 2 == 0){
                    count++;
                }
            }
        }
        else{
            for (int i = 1; i < 30; i++) {
                if(i % 2 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
