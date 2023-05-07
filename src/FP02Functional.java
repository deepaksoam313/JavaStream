//Print numbers in structured way of programming
import java.util.*;
public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,45,32,67,54,58,93,56);
        //printNumbersInFunctional(numbers);
        //printEvenNumbersFunctional(numbers);
        //printOddNumbersFunctional(numbers);
        printCubeOfNumbers(numbers);


    }

    private static void printCubeOfNumbers(List<Integer> numbers) {

        numbers.stream().
            filter(number -> number % 2 !=- 0).
                map(number -> number * number * number).
                        forEach(System.out::println);
    }
//    private static void printNumber(int n){
//        System.out.println(n);
//    }

    private static boolean printEvenNumber(int n){
       return n%2 ==0;
    }

    private static void printNumbersInFunctional(List<Integer> list){
        //list.stream().forEach(FP02Functional::printNumber);
        list.stream().
                forEach(System.out::println);
    }
    private static void printEvenNumbersFunctional(List<Integer> list){
        //list.stream().forEach(FP02Functional::printNumber);
        list.stream().
                filter(number -> number %2 ==0). //Lambda Exp
                //filter(FP02Functional::printEvenNumber).
                forEach(System.out::println); // Method Reference
    }

    private static void printOddNumbersFunctional(List<Integer> list){
        //list.stream().forEach(FP02Functional::printNumber);
        list.stream().
                filter(number -> number %2 !=0). //Lambda Exp
                //filter(FP02Functional::printEvenNumber).
                        forEach(System.out::println); // Method Reference
    }

}
