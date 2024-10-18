import java.util.Scanner;

public class InputAndPrintLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while(true){
            int num = sc.nextInt();
            if(num != 0){
                if(num > max) {
                    max = num;
                }
            }
            else
                break;
        }
        System.out.println(max);
    }
}
