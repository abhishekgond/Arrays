import java.util.Scanner;

public class if_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age<=12){
            if(age<5){
                System.out.println(" Your Age IS " + age);
            }
            else{
                System.out.println("CHILD");

            }
        }
        else if(age>=12 && age<=18){
            System.out.println("TEENAGER");
        }
        else if(age>18 && age<=100){
            System.out.println("Adult");
        }
        else if(age>100){
            System.out.println("Your age Is " + age);
        }


        String name = (age % 2==0) ? "Even": "odd ";
        System.out.println(name);
    }

}
