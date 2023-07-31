public class Demo6a {
    public static void main(String[] args) {

        int myInt1 = 5;
        int myInt2 = 0;

        
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_RESET = "\u001B[0m";

        System.out.printf("%s[%5d%5$s%s%d%%   ]%5$s \n",ANSI_RED_BACKGROUND , myInt1 ,ANSI_GREEN_BACKGROUND, myInt2, ANSI_RESET );
       


    }
}
