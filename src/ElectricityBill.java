import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        int bill = 0;

        if(unit <= 100){
            bill = unit * 1;
        }
        else if(unit <= 300){
            bill = 100 + ((unit - 100) * 2);
        }
        else{
            bill = 100 + (200*2) + ((unit - 300) * 5);
        }
        System.out.print(bill);
    }
}
