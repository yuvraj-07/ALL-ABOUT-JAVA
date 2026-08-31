package Human_Inheritance;

public class Grandparent {
    private String name;
    private int age;

    public Grandparent() {
        System.out.println("grandparent constructor called"); //here we trying to understand the use of constructor access
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void mess() {
        System.out.println("HI, I am the grandparent");
    }
}
