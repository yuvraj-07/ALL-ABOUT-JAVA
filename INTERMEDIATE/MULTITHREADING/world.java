//Through extend class using thread

//public class world extends Thread{
//    @Override
//    public void run() {
//        for (int i=1; i<1000; i++) {
//            System.out.println("world");
//
//        }
//    }
//}


//through runnable interface
public class world implements Runnable{
    @Override
    public void run() {
        for (int i=1; i<1000; i++) {
            System.out.println("world");

        }
    }
}