
//here we learned how to execute thread by extending the thread class with existing class
//public class test {
//    public static void main(String[] args) {
//        world wd =  new world();  //new state
//        wd.start(); //runnable state
//
//        for (int i=0; i<10000; i++) {
//            System.out.println("hello");
//        }
//    }
//}


//here we learned how to execute thread by implementing with the runnable class with existing class
public class test {
    public static void main(String[] args) {
        world wd =  new world(); //thread new state
        Thread t1 = new Thread(wd);  //its a way to execute a thread
        t1.start();  //its a way to start a thread

        for (int i=0; i<10000; i++) {
            System.out.println("hello");
        }
    }
}




