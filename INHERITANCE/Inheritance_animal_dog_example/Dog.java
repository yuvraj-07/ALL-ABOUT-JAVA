package Inheritance_animal_dog_example;

public class Dog extends Animal{
    //Now let us understand the override usage
    //lets declare the method of sayHello() here

    public void sayHello() {
        System.out.println("bhowwww"); //now here the dog class has its own property/behaviour that override the previous method sayHello()
    }
}
