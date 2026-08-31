public class computer {
    private String brand;
    private String model;

    private OperatingSystem os;

    public computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);

    }

    public OperatingSystem getOs() {
        return os;
    }

    class OperatingSystem {

        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayinfo() {
            System.out.println("this is the operating system" + osName);
        }
    }

}
