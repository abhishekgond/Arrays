import java.util.Scanner;
class ab{
     void print_( int a){
         for(int i=1; i<=a; i++){
             if(i==1){
                 for(int j=1; j<=a; j++){
                     System.out.print(j);
                 }
             }
             else {
                 for(int j=i; j<=a; j++){
                     System.out.print(j);
                 }
                 if(i>=2){
                     for(int j=1; j<=i-1; j++){
                         System.out.print(j);
                     }
                 }

             }

             System.out.println(" ");
         }
    }

}


public class _24_loop_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ab ab = new ab();
        ab.print_(a);
    }
}
