import java.util.Scanner;

public class si_calculating {
    public static void main(String arg[]){
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter Your Total Amount : ");
        int p = sc.nextInt();
        System.out.print("Enter Rate of intrest : ");
        float r = sc.nextFloat();
        System.out.print("Enter time period in year  : ");
        int t = sc.nextInt();

        float si = (p*r*t)/100;

        System.out.println("Your Principal Amount is : " + p);
        System.out.println("Your intreast on Amount is : " + r);
        System.out.println("Time is  : " + t);


        System.out.println(si);
        System.out.println("Total money is "+ (si + p));

    }
}
