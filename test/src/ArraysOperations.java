import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysOperations {
    public static void main(String[] args) {
        //int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};
        //int[] numbers = new int[5];
//        numbers[0] =1;
//        numbers[1] =2;
//        numbers[2] =3;
        int[] numbers = {1,2,3,4};
        System.out.println(numbers.length);
        System.out.println(Arrays.stream(numbers).reduce(Integer::sum));
        System.out.println(Arrays.toString(numbers));
        //System.out.println(Arrays.stream(numbers).findAny().toString());
        System.out.println(Arrays.stream(numbers).max());
        System.out.println(Arrays.stream(numbers).min());
        System.out.println(Arrays.stream(numbers).average());
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);

        Arrays.stream(numbers).findAny();
        int size = numbers.length;
        String str = "Deepak Soam";
        int strlength = str.length();

        Arrays.stream(numbers).filter(x->x%2 ==0)
                .forEach(System.out::println);




       // Array arr = new Array(3);

    }
}
