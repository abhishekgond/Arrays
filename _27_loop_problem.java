import java.util.Scanner;

public class _27_loop_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Row Number .. : ");
        int a= sc. nextInt();

        for(int i=1; i<=a; i++ ){
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");

        }
    }
}
