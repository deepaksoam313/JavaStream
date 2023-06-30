public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(isPrime(15));
    }

    private static String isPrime(int number) {
        if(number == 0| number==1){
            return "Not Prime Number";
        }
        if(number == 2)
            return  "Prime";

        for (int j = 2 ; j<= number/2 ; j++){
            if(number % j == 0)
                return "Not a Prime";
        }
        return "Prime";
    }
}
