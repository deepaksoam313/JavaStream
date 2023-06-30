import java.util.Locale;

public class VowelCheckInString {
    public static void main(String[] args) {
        String str = new String("Deepak");
        str = str.toLowerCase();

        System.out.println(str.toLowerCase().matches(".*[aeiou].*"));
//        for(int i = 0; i<str.length(); i++){
//           if (str.toLowerCase().charAt(i) == 'a'| str.charAt(i) == 'e'| str.charAt(i) == 'i'| str.charAt(i) == 'o'|str.charAt(i) == 'u' ){
//               System.out.println("Vowel Found in the String---> " + str);
//               break;
//           }
//        }
    }
}
