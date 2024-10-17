import java.util.Scanner;

public class EvenOrOdd {
    public static int Even(int num){
        if(num % 2 == 0){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = Even(num);
        if(res == 1)
            System.out.println("EVEN");
        else
            System.out.println("ODD");


    }
}
