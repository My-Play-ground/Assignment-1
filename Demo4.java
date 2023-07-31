public class Demo4 {
    public static void main(String[] args) {
        int myInt1 = 28;
        int myInt2 = 12;
        int myInt3 = 2023;

        int myInt4 = 23;
        int myInt5 = 59;
        int myInt6 = 59;

        final String COLOR1 = "\u001B[32m" ;
        final String COLOR2 = "\u001B[33m" ;
        final String COLOR3 = "\u001B[34m" ;
        final String COLOR4 = "\u001B[35m" ;
        final String COLOR5 = "\u001B[36m" ;
        final String COLOR6 = "\u001B[37m" ;
        final String RESET = "\u001B[0m" ;


        System.out.printf("%s%d%13$s/%s%d%13$s/%s%d%13$s %s%d%13$s:%s%d%13$s:%s%d%13$s \n", COLOR1,myInt1 ,COLOR2, myInt2 ,COLOR3, myInt3, COLOR4, myInt4,COLOR5, myInt5, COLOR6, myInt6, RESET);
    }
}
