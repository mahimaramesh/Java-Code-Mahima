import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        char given_value = sc.next().charAt(0);
        char convert = sc.next().charAt(0);
        double result = 0;

        if(given_value == 'k' && convert == 'm'){
            result = num * 1000;
            System.out.printf("%.2f",result);
            System.out.print("m");
        }
        else if(given_value == 'k' && convert == 'c'){
            result = num * 10000;
            System.out.printf("%.2f",result);
            System.out.print("cm");
        }
        else if(given_value == 'm' && convert == 'k'){
            result = num / 1000;
            System.out.printf("%.2f",result);
            System.out.print("km");
        }
        else if(given_value == 'm' && convert == 'c'){
            result = num * 100;
            System.out.printf("%.2f",result);
            System.out.print("cm");
        }
        else if(given_value == 'c' && convert == 'k'){
            result = num / 100000;
            System.out.printf("%.2f",result);
            System.out.print("km");
        }
        else if(given_value == 'c' && convert == 'm'){
            result = num / 100;
            System.out.printf("%.2f",result);
            System.out.print("m");
        }
        else{
            System.out.print("Invalid unit");
        }
    }
}
