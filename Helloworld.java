import java.util.Scanner;

class Helloworld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        boolean flag = true;
        System.out.println(flag);
        Scanner  cs = new Scanner(System.in);
        long a = cs.nextInt();
        int b = cs.nextInt();
//        System.out.println(a+b);

        if(a+b == 45){
            System.out.println("Your sum is ="+a+b);
        }
        else {
            System.out.println(a+b);
        }
    }
}
