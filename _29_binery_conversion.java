import java.util.Scanner;

public class _29_binery_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_number= sc.nextInt();

        int pw = 1;
        int res =0;
        while(binary_number>0){
            int unit_digit = binary_number % 10;
            res +=(unit_digit * pw);
            binary_number /= 10;
             pw *= 2;
        }
        System.out.println(res);
    }



}

