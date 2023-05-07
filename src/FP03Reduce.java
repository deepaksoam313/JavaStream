import java.util.*;

public class FP03Reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6,7);

       int sum =  sumOfAllElements(list);
        //System.out.println(sum);

        //Find minumum of list
       // minimumFromList(list);

        //Square every number in the list and find the sum of squares
        findSquareAndAdd(list);

        //find sum of all odd numbers from the list
        findSumOfOddNumbers(list);

    }

    private static void findSumOfOddNumbers(List<Integer> list) {
        System.out.println(list.stream().filter(x-> x%2 != 0).reduce(0,(a,b)-> a+b));
    }

    private static void findSquareAndAdd(List<Integer> list) {
        //System.out.println(list.stream().map(number ->number*number).reduce(0,(a,b)-> a+b));
        //Integer :: sum
        System.out.println(list.stream().map(x->x*x).reduce(0,Integer::sum));
    }

    private static void minimumFromList(List<Integer> list) {
        System.out.println(list.stream().
                reduce(Integer.MAX_VALUE, (x,y)-> x<y? x: y));
    }

    private static int sumOfAllElements(List<Integer> list) {
        int sum  =list.stream().
                //reduce(0, (a,b) -> a+b);
                    reduce(0, Integer::sum );
        return sum;
        }
    }

