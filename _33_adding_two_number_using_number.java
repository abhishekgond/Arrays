import java.util.Scanner;
import java.math.*;



public class _33_adding_two_number_using_number {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        math add = new math();
        System.out.println(add.sum(a,b));
        System.out.println(add.sub(a,b));
        System.out.println(add.div(a,b));
        System.out.println(add.mod(a,b));
        System.out.println(add.mul(a,b));
         System.out.println(Math.sqrt(2.3));


    }
}
class math{
    int  sum(int a, int b){
        int su = a+b;
        return su;
    }
    int  sub(int a, int b){
        if(a>b){
            return a-b;
        }
        else{
            return b-a;
        }
    }float  div(int a, int b){
         if(a>b){
             return a/b;
         }
         else{
             return b/a;
         }
    }
    int  mul(int a, int b){
        int su = a*b;
        return su;
    }int  mod(int a, int b){
        int su = a%b;
        return su;
    }

}
