
import java.util.Scanner;

public class array_{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int arr [] =  new int [a];

        int n;
    for(int i=0; i<arr.length; i++){
            arr [i] = sc.nextInt();
        }
         int sum=0;
         for(int i=0; i<arr.length; i++){
             sum += arr[i];
         }
        System.out.println("Total Sum OF Given Number : = "+sum);
    }
}