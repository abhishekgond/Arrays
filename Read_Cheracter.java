import java.util.Scanner;

public class Read_Cheracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The Character");
//        char name = sc.nextLine().charAt(0);
//        System.out.println(name);

        String name = sc.nextLine();
        for(int i=0; i<name.length(); ++i){
//        System.out.println(i);
            System.out.println(i+ " " + name.charAt(i));
        }
    }
}
