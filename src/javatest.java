import java.util.*;
import java.util.stream.Collectors;

public class javatest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Deepak", "Ravi","Abhi", "Chintu");


        List<Integer> listInt = Arrays.asList(2,5,3,6,9,8);
        //Set<String> hashSet = new HashSet<String>(listInt);

        System.out.println(listInt.stream().filter(x-> x>5).mapToInt(i->i).sum());



        Iterator<Integer> iter = listInt.iterator();
        int sum = 0;
        while(iter.hasNext()){
            int num = iter.next();
            sum += num;

        }
       // System.out.println(sum);
        //System.out.println(Collections.frequency(list,"Deepak"));

       // list.
        List<String> list2 = list.stream().collect(Collectors.toUnmodifiableList());
        //list2.add("Ravi");

//        for(String str : list2)
//            System.out.println(str);



    }
}
