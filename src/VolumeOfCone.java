import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        System.out.println((Math.PI * Math.pow(radius,2) * height / 3));
    }
}
//Volume Of Prism = b * h
//Volume Of Cylinder = pi * r^2 * h
//Volume Of Sphere = 4/3 pi r^3
//Volume Of Pyramid = 1/3 * base * h