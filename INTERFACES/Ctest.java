public class Ctest {
    public static void main(String[] args) {
        Cdog cd = new Cdog();
        cd.eat();
        cd.sleep();
        System.out.println(Cdog.MAX_AGE);
        cd.info();
        Cnimal.info();
    }
}
