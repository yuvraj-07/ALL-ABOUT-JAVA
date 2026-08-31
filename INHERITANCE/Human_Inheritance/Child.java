package Human_Inheritance;

public class Child extends Parent{
    public void mess() {

        System.out.println("Hi, I am the child");
    }
    public Child() {
        super();
        System.out.println("child constructor called");
    }

    public void childMethod() {
        System.out.println("child method called");
        super.parentMethod();
    }
}
