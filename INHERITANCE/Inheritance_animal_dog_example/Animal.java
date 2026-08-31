package Inheritance_animal_dog_example;//Here we understand how we can access the method through inheritance

public class Animal {
    private String name;
    private int age;

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

    public void eat() {
        System.out.println("this animal eats foood");
    }
    public void sayHello() {
        System.out.println("meow");
    }
}
