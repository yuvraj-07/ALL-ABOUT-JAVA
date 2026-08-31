public class Car {
    private String Model;
    private boolean EngineOn;

    public Car(String model) {
        this.Model = Model;
        this.EngineOn = false;
    }

    class Engine{
        void start() {
            if(!EngineOn) {
                EngineOn = true;
                System.out.println("Engine is started");
            }
            else {
                System.out.println("engine is already on");
            }
        }

        void stop() {
            if(EngineOn) {
                EngineOn = true;
                System.out.println("Engine stopped");
            }
            else {
                System.out.println("engine is already stoped");
            }
        }
    }
}
