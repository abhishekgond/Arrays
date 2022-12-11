import java.util.Scanner;

class  binary{
     void conversion(int a){
         int ans =0;
         int pw =1;

         while (a>0){
              int digit = a % 10;
              ans += (digit * pw);
              a /= 10; // a = a/10;
              //pw *= 2;
              pw = pw *2;  // pw *= 2

         }
         System.out.println(ans);


     }





}




public class _30_loop_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        binary bi = new binary();
        bi.conversion(a);

    }
}
