import java.util.Scanner;

public class HcfLcm {
    public static int hcf(int num1, int num2){
        while(num1 > 0 && num2 > 0){
            if(num1 > num2)
                num1 = num1 % num2;
            else
                num2 = num2 % num1;
        }
        return num1 == 0 ? num2 : num1;
    }
    public static int lcm(int num1, int num2){
        int LCM = 0;
        LCM = num1 * num2 / hcf(num1, num2);
        return LCM;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int hcf = hcf(num1, num2);
        int lcm = lcm(num1, num2);
        System.out.println("HCF is " + hcf);
        System.out.println("LCM is " + lcm);
    }
}
