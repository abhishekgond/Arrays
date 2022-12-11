import java.sql.SQLOutput;
import java.util.Scanner;

public class problem_if_else_1 {
    public static void main(String[] args) {
//        Write a program To print The Value if it is even and divisible by 3 .
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number % 3 ==0 && number % 2==0 ){
            System.out.println("This number is Divisible By  3 and it is even number also " + number );

        }

        else{
            if(number % 3 ==0){
                System.out.println("This Number = "+ number + " divisible By 3 , But This is Not A Even Number " );
            }
            else if (number % 2 ==0){
                System.out.println("This Number = "+ number + "  is Even Number, But Not  divisible By 3");
            }
            System.out.println("Your Number is :  " + number);

        }
    }
}
