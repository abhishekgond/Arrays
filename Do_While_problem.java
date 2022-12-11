import java.util.Scanner;

public class Do_While_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n= sc.nextInt();
        // Print sum of The stream of The integers  in the input.
       int  sum =0;
        while (n != -1){
            sum += n;
            n = sc.nextInt();
        }
        System.out.println(sum);
////
////

//        do{
//            sum += n;
//            n= sc.nextInt();
//        }while(n != -1);
//        System.out.println(sum);

    }


}
