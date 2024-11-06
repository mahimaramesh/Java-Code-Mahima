
class Calculator1{
    int num = 5;
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1, int n2){
        //System.out.println("hi");
        return n1 + n2;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        int r1 = calc.add(3,4,5);
        System.out.println(r1);

    }
}
