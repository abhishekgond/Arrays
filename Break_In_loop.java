import java.util.Scanner;

public class Break_In_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n= sc.nextInt();
        for (int i=0; i<=n; i++){
            if(i==5)
//                break;
                continue;
            System.out.println(i);

        }
    }
}
