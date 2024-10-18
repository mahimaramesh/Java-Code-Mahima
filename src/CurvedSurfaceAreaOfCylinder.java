import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        int height = sc.nextInt();
        System.out.println(2 * Math.PI * rad * height);
    }
}
//Total Surface Area Of Cube = 6a^2