import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Deepak {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Deepak", "Ravi", "manish");
        Collections.reverse(list);
        for(String s: list)
            System.out.println(s);

    }
}
