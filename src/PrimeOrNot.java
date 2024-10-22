import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int i = 2;
        while(i * i <= n){
            if(n % i ==0 ){
                return false;
            }
            i++;
        }
        return i * i > n;
    }
}
