import java.util.*;
public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

//        char[] chars = str.toCharArray();
//        StringBuilder revString = new StringBuilder();
//        //System.out.println(chars[0]);
//        //List<String> revString = new ArrayList<>();
//
//        for (int i = str.length() -1; i>=0; i--){
//            revString.append(chars[i]);
//        }
//        System.out.println(revString);
        String[] charArray = str.split(" ");
        System.out.println(charArray[0]);



    }
}
