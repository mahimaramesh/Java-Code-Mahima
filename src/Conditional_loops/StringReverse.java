package Conditional_loops;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String rev = reverse(name);
        System.out.println(rev);
    }
    static String reverse(String str){
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
}
