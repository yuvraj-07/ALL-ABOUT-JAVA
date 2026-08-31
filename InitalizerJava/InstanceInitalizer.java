public class InstanceInitalizer {
        static int a;
        {
            a = 10;
            int b = 20;
            int c = a+b;
            System.out.println(c);
        }

        InstanceInitalizer() {
            System.out.println("now the constructor called");

        }

    public static void main(String[] args) {
        InstanceInitalizer is = new InstanceInitalizer();

    }

}
