import java.sql.SQLOutput;
import java.util.Scanner;

public class pattern_printing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        outer :for(int i=1; i<=3; i++){
            inner :for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println( " ");
        }

    }
}
