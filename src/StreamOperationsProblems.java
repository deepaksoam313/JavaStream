import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationsProblems {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<String> list2 = Arrays.asList("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
        Stream<String> stream = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
        List<Integer> listInt = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        Set<Integer> set = new HashSet<>(listInt);


        System.out.println(
        listInt.stream().filter(n-> set.add(n))
                        .collect(Collectors.toSet())
        );

        System.out.println(list2.stream().findFirst());

        int size = list2.size();
        System.out.println(list2.get(size-1));
//        System.out.println(
//                stream
//                .reduce((first,second) -> first)
//        );


    }
}
