import java.util.Scanner;

class constructors{
    int a;
    int b ;

    constructors(int x , int y ){
        a=x;
        b=y;
        System.out.println(" Calling Constructors ");
        System.out.println(add());
        System.out.println(mul());
        System.out.println(div());

    }

    int add(){
        return a+b;
    }
    int mul(){
        return a*b;
    }
    int div(){
        return a-b;
    }

}



public class _37_Constructors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        constructors co = new constructors(5, 7);
        constructors co2 = new constructors(6, 7);
        constructors co3 = new constructors(1, 0);
    }

}
