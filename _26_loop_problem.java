import java.util.Scanner;

public class _26_loop_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc. nextInt();
        int b= sc. nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                int sum = i+j;
//                System.out.println(sum);
                if(sum%2 == 0){
                    System.out.print(1);
                }
                else {
                    System.out.print(2);
                }
            }
            System.out.println(" ");
        }
    }
}
