package Conditional_loops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            char ch = sc.next().charAt(0);
            if(ch == 'x'  || ch == 'X'){
                break;
            }
            else{
                sum = sum + Integer.parseInt(String.valueOf(ch));
            }
        }
        System.out.println(sum);
    }
}
