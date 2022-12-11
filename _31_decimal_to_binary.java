import java.util.Scanner;

public class _31_decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int sum =0;
        int binary=1;
        while(a>0){
            int rem = a % 2;
            sum += (rem * binary);
            binary *= 10;
            a /=2;

        }
        System.out.println(sum);
//
    }
}
