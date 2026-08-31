public class Test {
    public static void main(String[] args) {
        SHoppingCAsr sp = new SHoppingCAsr(2000);
        sp.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("paid" + amount + "using credit card");
            }
        });


    }
}
