package Inheritance_animal_dog_example;

import Human_Inheritance.Child;
import Human_Inheritance.Grandparent;
import Human_Inheritance.Parent;

public class TEST {
    public static void main(String[] args) {
        Child child = new Child(); //the grandparent constructor called first bcuz they are inherting each other but the main class is the grandparent so that executes firsts
        child.setName("alex");
        child.setAge(10);
        System.out.println(child.getName());
        System.out.println(child.getAge());
        child.mess();

        Parent parent = new Parent();
        parent.setName("mukesh");
        parent.setAge(50);
        System.out.println(parent.getName());
        System.out.println(parent.getAge());
        parent.mess();











    }
}
