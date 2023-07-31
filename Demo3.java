public class Demo3 {
    public static void main(String[] args) {
        int areaCode = 123;
        int myInt1 = 456;
        int myInt2 = 7890;

        final String COLOR = "\033[32m";
        final String RESET = "\033[0m";

        System.out.printf("(%s%d%s) %03d-%04d \n" ,COLOR, areaCode, RESET, myInt1, myInt2);
        
    }
}
