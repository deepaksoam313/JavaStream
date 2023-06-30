import java.util.*;
import java.util.stream.Collectors;
@FunctionalInterface
interface Solution {
    int factorial (int a);
}


public class Test {


    public static void main(String[] args) {
        //Solution sol = (int val)-> val + 2;
        Solution sol = (int val)->{
            int a = val +2;
            return a;


        };
        System.out.println(sol.factorial(4));
//        Solution sol = (int val )->{
//            int i = val * 2;
//        };


        List<Character> list = Arrays.asList('a','b','c','a','b','c');

        //char value =

        Set<Character> distinct = new HashSet<>(list);
//        for (Character s: distinct) {
//            System.out.println(s + ": " + Collections.frequency(list, s));
//        }

        for (Character c : distinct){
            System.out.println(Collections.frequency(list,c));
        }

//    private static void noOfOccurance(List<Character> list) {
//
//        int count =0;
//
//        for (int i = 0; i<list.size();i++){
//            for (char c :list){
//                if(c == list.get(i)){
//                    count ++;
//            }
//                System.out.println(c +"->>" + count);
//                count = 0;
//            }
//
//
//        }
        //list.stream().distinct().filter(a -> a.c
//        for (char c : list){
//            int count = 0;
//            if((boolean) list.stream().filter(d -> list.contains(d))){
//                count++;
//            }
//            System.out.println(c +"->>"+ count);
//        }
    }
}
