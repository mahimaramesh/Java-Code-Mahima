package Conditional_loops;

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);

        boolean isVowel1 = isVowel(ch1);
        boolean isVowel2 = isVowel(ch2);

        if(isVowel1 && isVowel2)
            System.out.println("Sum is " + (int)(ch1 + ch2));
        else if(isVowel1 || isVowel2)
            System.out.println("Difference is " + (int)(ch1 - ch2));
        else
            System.out.println("Product is " + (int)(ch1 * ch2));
    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

