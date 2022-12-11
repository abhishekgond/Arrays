import java.util.Scanner;

class student{
    int roll_no =1;
    String name = "Abhishek";
}





public class _32_opps_Concepts {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

//        String b = sc.next();
        student obj1 = new student();
        obj1.roll_no  = 1;
        obj1.name  = "abhishek";
        student obj2 = new student();
        obj2.roll_no  = 2;
        obj2.name  = "abhi";
        System.out.println(obj1.roll_no);
        System.out.println(obj1.name);
        System.out.println(obj2.roll_no);

        System.out.println(obj2.name);
    }
}
