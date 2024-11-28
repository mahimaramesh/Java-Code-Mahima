package Problems;

import java.util.Scanner;

public class EvenOddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= range ; i++) {
            if(i % 2 == 0){
                result += (int) Math.pow(i, 3);
            }
            else{
                result += (int) Math.pow(i, 2);
            }
        }
        System.out.println(result);
    }
}
