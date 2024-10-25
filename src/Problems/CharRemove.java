package Problems;

import java.util.Scanner;

public class CharRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if(!str2.contains(String.valueOf(str1.charAt(i)))){
                result.append(str1.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}
