import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Deepak", "Ravi", "Kaalu","Amar");
        Collections.reverse(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, "Kaalu"));

        for(String str : list)
            System.out.print(str +" ");

        //System.out.println(list.stream().map(Collections.reverse(list)).toList());
    }
}
