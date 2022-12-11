package abhi.math;

public class _1_abhi_math {
    public static void main(String[] args) {

    }
}
class math{
    int  sum(int a, int b){
        int su = a+b;
        return su;
    }
    int  sub(int a, int b){
        if(a>b){
            return a-b;
        }
        else{
            return b-a;
        }
    }float  div(int a, int b){
        if(a>b){
            return a/b;
        }
        else{
            return b/a;
        }
    }
    int  mul(int a, int b){
        int su = a*b;
        return su;
    }int  mod(int a, int b){
        int su = a%b;
        return su;
    }

}
