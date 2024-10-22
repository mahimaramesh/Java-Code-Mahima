package Conditional_loops;

public class Shadowing {
    static int x = 50;   // will be shadowed @line 6
    public static void main(String[] args) {
        System.out.println(x);
        int x = 70;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
