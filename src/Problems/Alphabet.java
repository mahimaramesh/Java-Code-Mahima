package Problems;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String res = Alpha(name);
        System.out.println(res);
    }

    static String Alpha(String str) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char currentChar = arr[i];
            for (int j = 0; j < vowels.length; j++) {
                if (currentChar == vowels[j]) {
                    arr[i] = vowels[(j + 1) % vowels.length];
                    break;
                }
            }
        }
        arr = str.toCharArray();
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
