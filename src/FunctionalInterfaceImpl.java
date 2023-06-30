@FunctionalInterface
interface functnl {
    int show(int i,int j);
}
//class Impl implements functnl{
//    public void show(){
//        System.out.println("Hi,Deepak here");
//    }
//
//}
public class FunctionalInterfaceImpl {
    public static void main(String[] args) {
        //functnl obj =i -> System.out.println("value is " +i);
        functnl obj2 = (i,j) -> i+j;

        int result = obj2.show(5,6);
        System.out.println(result);
    }
}
