public class RemoveWhitespaces {
    public static void main(String[] args) {

        String str = "My name is Deepak";
        System.out.println(removeWhitespace(str));
    }

    private static String removeWhitespace(String str) {
        StringBuilder out = new StringBuilder();
        char[] charArray = str.toCharArray();
//        for(char c : charArray){
//            if(!Character.isWhitespace(c)){
//                out.append(c);
//            }
//        }
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == ' '){
                continue;
            }
            else
                out.append(str.charAt(i));
        }

        return out.toString();
    }


}
