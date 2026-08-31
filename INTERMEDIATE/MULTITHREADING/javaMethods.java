//In this we have to learn about the java methods like: start(), run(), sleep(), join()...

public class javaMethods extends Thread {

    @Override
    public void run() {

            for(int i=1; i<=5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(i);
            }


    }

    public static void main(String[] args) throws InterruptedException {
        javaMethods jm = new javaMethods();
        jm.start();
        jm.join();
        System.out.println("hello");
    }
}
