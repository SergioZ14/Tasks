package inheritance.task2.model;

public class Cat extends Animal{
    public Cat(String name, String color, int age) {
        super.name = name;
        super.color = color;
        super.age = age;
        System.out.printf("I'm a %s cat. My name is %s. I'm %d years old.\n", color, name, age);
    }

    public void meow() {
        sound();
    }

    @Override
    public void sound() {
        System.out.println("meow");
    }
}
