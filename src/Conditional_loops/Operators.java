package Conditional_loops;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        char operator = sc.next().charAt(0);

        if(operator == '+'){
            System.out.println(num1 + num2);
        }
        else if(operator == '-'){
            System.out.println(num1 - num2);
        }
        else if(operator == '/'){
            System.out.println((double)num1/num2);
        }
        else if(operator == '*'){
            System.out.println(num1 * num2);
        }
        else{
            System.out.println("Invalid input.");
        }
    }
}
