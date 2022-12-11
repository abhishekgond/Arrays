public class _38_public_access_modifier {
    public String str_1 = "I am public access modifier";
    void PrintFromClass(){
        System.out.println("Within class : " + str_1);
    }

    public static void main(String[] args) {
        _38_public_access_modifier ab = new _38_public_access_modifier();
        ab.PrintFromClass();
        System.out.println("Within class : "+ab.str_1);

    }
}
