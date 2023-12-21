package hu.webler;


import hu.webler.animal.Cat;
import hu.webler.animal.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        dog.bark();
        cat.mehow();
        dog1.bark();
        cat1.mehow();
    }
}