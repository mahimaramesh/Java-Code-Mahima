package Problems;

import java.util.Scanner;

public class StringSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int str1count = 0;
        int str2count = 0;

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == ' '){
                str1count += 1;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) == ' '){
                str2count += 1;
            }
        }
        int diff = Math.abs(str1count - str2count);
        String res = " ";
        if(diff % 2 == 0){
            res = "Even" + diff;
        }
        else{
            res = "Odd" + diff;
        }
        System.out.println(res);
    }
}
