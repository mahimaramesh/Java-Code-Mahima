import java.util.Scanner;

public class PalindromeOrNot {
    public static boolean isPalindrome(String name){
        int start = 0;
        int end = name.length() - 1;
        while(start < end) {
            if(name.charAt(start) != name.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = name.toLowerCase();

        if(isPalindrome(name)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
