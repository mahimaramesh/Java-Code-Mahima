package Conditional_loops;

public class ChangeNamePV {
    public static void main(String[] args) {
        String name = "Mahima";
        System.out.println(name);
       String naam = changeName(name);
        if(name.equals(naam)){
            System.out.println("pointing same");
        }
        else{
            System.out.println("Not");
        }
        System.out.println(naam);

    }
    static String changeName(String naam){
        naam = "Gowtham";
       return naam;
    }
}
