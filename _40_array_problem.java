import java.util.Scanner;

public class _40_array_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int n;
        int arr [] =  new int [a];



        // Taking Input From User In Array And Print it ...
         for(int i=0; i<arr.length; i++){
            arr [i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


        // Taking input From The user and add This number Which is Given by User
//         arr[0] =1;
//         arr[1] =5;
//         arr[2] =3;

//        for(int i=0; i<arr.length; i++){
//            arr [i] = sc.nextInt();
//        }
//         int sum=0;
//         for(int i=0; i<arr.length; i++){
//             sum += arr[i];
//         }
//        System.out.println("Total Sum OF Given Number : = "+sum);
    }
}
