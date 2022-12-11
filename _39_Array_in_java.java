import java.util.Scanner;

class array_example{
    void demo_method(){
        int age [] = new int[3];
        String name [] = new String[3];
        float weight [] = new float[3];

        age [0] = 10;
        age [1] = 13;
        age [2] = 16;
        weight[0] = 40.3f;
        weight[1] = 70.3f;
        weight[2] = 50.3f;
        name[0] ="Abhisheek " ;
        name[1] ="Kishan " ;
        name[2] ="Ram " ;

//       1.
//        for(int i=0; i<age.length; i++){
//                System.out.println(age[i]);
//        }

//        2.

//        for(float weigh : weight){
//            System.out.println(weigh);
//        }

//        3.
//        int i=0;
//           while (i<name.length){
//               System.out.println(name[i]);
//               i++;
//           }
//        System.out.println(age[0]);
//        System.out.println(age[1]);
//        System.out.println(age[2]);
//        System.out.println(weight[0]);
//        System.out.println(weight[1]);
//        System.out.println(weight[2]);
//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);
    }

    void multi_arrays(){
        int [][] num = new int[2][3];

        num [0] [0] = 12;
        num [0] [1] = 9;
        num [0] [2] = 4;
        num [1] [0] = 39;
        num [1] [1] = 20;
        num [1] [2] = 87;

        for(int i=0; i<num.length; i++){
            for(int j=0;j<num[i].length; j++){
                System.out.println(num[i][j]);
            }

        }

//        System.out.println(num [0][0]);
//        System.out.println(num [0][1]);
//        System.out.println(num [0][2]);
//        System.out.println(num [1][0]);
//        System.out.println(num [1][1]);
//        System.out.println(num [1][2]);
//        System.out.println(num.length);


    }

}

public class _39_Array_in_java {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        int n = sc.nextInt();

        array_example obj = new array_example ();
        obj.demo_method();
        obj.multi_arrays();


    }
}
