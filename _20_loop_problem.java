import java.util.Scanner;

class abh{
    void line_open(){
        System.out.println("------------------------------------------------------------------------------");

    }

    void pattern_printing( int r, int c){

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++ ){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }
    void line_close(){
        System.out.println("------------------------------------------------------------------------------");

    }

}
public class _20_loop_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        abh ab = new abh();
        ab.line_open();
        ab.pattern_printing(a,b);
        ab.line_close();



    }
}
