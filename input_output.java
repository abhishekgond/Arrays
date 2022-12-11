import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number :" );
        int a = sc.nextInt();
        System.out.print("Enter The Second Number :" );

        int b = sc.nextInt();
         int sum = a+b;
        System.out.println("Total After  Addition "+sum);

        System.out.print("Enter Your Name ");
        String name;
        name = sc.next();

        System.out.println("Your name is :"+ name);

    }
}
