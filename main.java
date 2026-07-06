public class main {
    public static void main(String[] args) {
        car c = new car();
        System.out.println("before modifying");
        c.car = "BMW";
        c.timeMade = 1991;
        c.carSpeed = 20;
        c.caracceleration = 20000;
        c.display();
        System.out.println("after modifying");
        c.car = "AUDI";
        c.timeMade = 1992;
        c.carSpeed = 30;
        c.caracceleration = 30000;
        c.display();

    }
}
