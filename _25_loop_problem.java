import java.util.Scanner;

public class _25_loop_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        for(int i=1;i<=4; i++){
            for(int j=1;j<=a; j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }
}
