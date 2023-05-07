import javax.sound.sampled.EnumControl;
import java.util.*;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,5,2,7,3,6,5,9,8);

        printDistinct(list);
    }

    private static void printDistinct(List<Integer> list) {
       List<Integer> list2 = new ArrayList<>();
               list.stream().
                       distinct().sorted(Comparator.reverseOrder()).
                            forEach(System.out::println);

               //Both are the same thing
        //list2 = list.stream().map(n -> n*n).collect(Collectors.toList());
         //list2 = list.stream().map(n -> n*n).toList();

//        for(int numbers:list2){
//            System.out.println(numbers);
//        }

    }
}
