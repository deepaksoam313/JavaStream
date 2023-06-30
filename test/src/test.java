import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Given an array of integers, find if the array contains any duplicates.
//        Function should return true if any value appears more than once in the array. False otherwise.
//        Input: [1,2,3]
//        Output: false
//
//        Input: [1,2,3,1]
//        Output: true
public class test {
    public static void main(String[] args) {
        int[] arrCheck = new int[]{1,2,3,6,4,9,5};
        int count = 0;

        //List<Integer> list = Arrays.asList(arrCheck);
        //Set<Integer> localSet = new HashSet<>(arrCheck);
        for(int i = 0; i< arrCheck.length; i++){
            count = 0;
            for(int j = i; j<arrCheck.length -i ; j++)
            {

                if(arrCheck[i] == arrCheck[j]){
                    count++;
                    //System.out.println("true");
                }
            }

        }
        if(count > 2)
            System.out.println(true);
        else
            System.out.println(false);
    }

}
