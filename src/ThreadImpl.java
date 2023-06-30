//

//class A implements Runnable{
//    public void run(){
//        for(int i=0; i<20; i++){
//            System.out.println("A");
//
//
//            try {
//                Thread.sleep(20);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
//}

//class B extends Thread{
//    public void run(){
//        for(int i=0; i<20; i++){
//            System.out.println("Inside B");
//
//            try {
//                Thread.sleep(20);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//    }
//}

class B implements Runnable{
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println("Inside B");

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class ThreadImpl {
    public static void main(String[] args) {
        Runnable obj1 = ()-> {
            for (int i = 0; i < 20; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };



        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2  = new Thread(obj2);

        t1.start();
        //Thread.sleep(2);
        t2.start();

    }
}
