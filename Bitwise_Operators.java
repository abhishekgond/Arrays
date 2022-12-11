public class Bitwise_Operators {
    public static void main(String[] args) {
        int p = 9; // 1001
        int q =10; // 1010
        System.out.println(p | q); // 11 >>>>>>> 1001(9) comparing 1010(10) == 1011(11)
        System.out.println(p & q); // 8
        System.out.println(p ^ q); // 3

        System.out.println(p << 1); // 18
        System.out.println(p << 2); // 36

        System.out.println(q >> 1); // 5
        System.out.println(q >> 2); // 2

    }
}
