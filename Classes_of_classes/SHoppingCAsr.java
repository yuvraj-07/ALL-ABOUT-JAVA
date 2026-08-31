public class SHoppingCAsr {
    private double totalAMount;

    public SHoppingCAsr(double totalAMount) {
        this.totalAMount = totalAMount;
    }

    void processPayment(Payment py) {
        py.pay(totalAMount);
    }
}
