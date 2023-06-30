public class FibonaciSeries {
    public static void main(String[] args) {

        printFibonaci(5);
    }

    private static void printFibonaci(int i) {
        int a = 0, b, c;
        b = 1;
        c= a+b;
        //System.out.print(" "+a);
        for(int j = 0; j<= i ; j++){

            System.out.print(" "+a);
            a = b;
            b = c;
            c = a+b;
        }
    }
}
