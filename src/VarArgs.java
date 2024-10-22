import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //args(1,2,3,4,5);
        multiple(5,7,"Mahima", "Gowtham");
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a + " " + b + Arrays.toString(v));
    }
    static void args(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
