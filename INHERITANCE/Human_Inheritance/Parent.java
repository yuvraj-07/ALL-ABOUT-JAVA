package Human_Inheritance;

public class Parent extends Grandparent{

    public void mess() {
       System.out.println("Hi, i am the parent");
   }

    public Parent() {
        super();
       System.out.println("parent constructor called");//another constructor accessed by child


    }

    public void parentMethod() {
        System.out.println("Parent method called");
    }
}
