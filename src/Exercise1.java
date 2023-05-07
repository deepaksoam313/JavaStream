import java.util.*;
public class Exercise1 {
    public static void main(String[] args) {
        List<String> list =  Arrays.asList("Spring", "Spring Boot","API", "Microservices", "AWS", "PCF","Azure","Docker","Kubernetes");

        //printIndivisually(list);

        //2. print words that contains the word : Spring
       // printSpringMatchesWords(list);

        //3. Print Courses whose name has atleast four letters
        //printWordsContainsFourLetters(list);

        //4. Number of Characters in each word
        printNumberOfCharacters(list);

    }

    private static void printNumberOfCharacters(List<String> list) {
        list.stream().
                //filter(str-> str.length()).
                       map(str -> str.length()).  //Mapping
                    forEach(System.out::println);
    }

    private static void printWordsContainsFourLetters(List<String> list) {
        list.stream().
                filter(str -> str.length() >=4).
                    forEach(System.out::println);
    }

    private static void printSpringMatchesWords(List<String> list) {
        list.stream().
                filter(str -> str.contains("Spring")).
                    forEach(System.out::println);
    }

    private static void printIndivisually(List<String> list) {
        list.stream().
                forEach(System.out::println);
    }


}
