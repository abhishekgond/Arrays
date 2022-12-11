import java.util.Scanner;
class abhi_{
        void pattern_printing(int b){
            int i;

            outer_loop:for( i=1; i<=b; i++){
               inner_loop_for_Spaces:for(int j=1; j<= (b-i); j++){
                    System.out.print(" ");
                }
                inner_loop_for_star:for(int j=1; j<= (i*2 -1); j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
        }
}


public class _23_loop_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        abhi_ ab =new abhi_();
        ab.pattern_printing(a);
    }
}
