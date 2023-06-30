import java.sql.SQLOutput;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "deepak";
        //System.out.println(str.indexOf("pak"));
        System.out.println(checkPalindrome(str));
    }

    private static boolean checkPalindrome(String str) {
        for(int i =0; i<str.length(); i++){
            if(str.toLowerCase().charAt(i) != str.toLowerCase().charAt(str.length() -1 - i)){
                return false;
            }

        }
        return true;
    }
}
