import java.util.StringJoiner;

public class stringjoiner {
    public static void main(String[] args) {
        //StringJoiner stringJoiner = new StringJoiner(",", "#","#");
        StringJoiner stringJoiner = new StringJoiner(",", "#", "#");
        stringJoiner.add("Deepak");
        stringJoiner.add("Ravi");
        stringJoiner.add("Manish");
        System.out.println(stringJoiner);

    }
}
