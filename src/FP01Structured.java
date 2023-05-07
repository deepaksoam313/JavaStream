//Print numbers in structured way of programming
import java.util.*;
public class FP01Structured {

    public static void main(String[] args) {

        printAllNumbersInStructured(Arrays.asList(10,11,45,22,45,22,66,54,66,65));
        //Java 9 feature
        //printAllNumbersInStructured(List.of(10,11,45,22,45,22,66,54,66,65));
    }

    private static void printAllNumbersInStructured(List<Integer> list) {
        for(int numbers : list){
            System.out.println(numbers);
        }
    }
}