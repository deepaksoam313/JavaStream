import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {//
        // System.out.println("Hello world!");
        LinkedList<String> llist = new LinkedList<String>(Arrays.asList("Deepak","Rajeev"));
        List<String> lst = new ArrayList<>();
        List<String> ls =  Arrays.asList("ravi","Deepak");
        lst.add("Deepak");
        lst.add("ravi");
        llist.add("Deepak");
        llist.removeFirstOccurrence("Deepak");
        System.out.println(llist);
        System.out.println(lst);

    }
}