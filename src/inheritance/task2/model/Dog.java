package inheritance.task2.model;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super.name = name;
        super.color = color;
        super.age = age;
        System.out.printf("I'm a %s dog. My name is %s. I'm %d years old.\n", color, name, age);
    }

    public void woof() {
        sound();
    }

    @Override
    public void sound() {
        System.out.println("woof");
    }
}
