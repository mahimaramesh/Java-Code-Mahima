package Problems;

import java.util.Scanner;

public class Rhyming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = Integer.MIN_VALUE;
        String newStr = " ";
        String str1 = sc.next();
        String[] strArr = new String[num];
        for (int i = 0; i < num; i++) {
            strArr[i] = sc.next();
        }
        for (int i = 0; i < num; i++) {
            String str = strArr[i];
            if(!str.equals(str1)) {
                int count = 0;
                for (int j = 0; j < str1.length(); j++) {
                    for (int k = 0; k < str.length(); k++) {
                        if (str1.charAt(j) == str.charAt(k)) {
                            count += 1;
                        }
                    }
                }
                if (count > max) {
                    max = count;
                    newStr = str;
                }
            }
        }
        System.out.println(newStr);
    }
}
