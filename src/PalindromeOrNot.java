import java.util.Scanner;

public class PalindromeOrNot {
    public static boolean isPalindrome(String name){
        int start = 0;
        int end = name.length() - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = name.toLowerCase();
        String copy = name;
        String rev = "";


        while(start < end){
            rev = rev + end;
            start++;
            end--;
        }


    }
}
