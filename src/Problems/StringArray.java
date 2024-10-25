package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = Integer.MIN_VALUE;
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = sc.next();
        }
        for (int i = 0; i < num; i++) {
            int count = 0;
            String str1 = str[i];
            for(int j = 0; j < str1.length(); j++){
                char ch = str1.charAt(j);
                if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
                    count += 1;
                }
            }
            int fact = 1;
            for(int k = 1; k <= count; k++){
                fact *= k;
            }

            if(fact > max){
                max = fact;
            }
        }
        System.out.println(max);
    }
}
