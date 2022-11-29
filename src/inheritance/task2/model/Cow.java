package inheritance.task2.model;

public class Cow extends Animal {
    public Cow(String name, String color, int age) {
        super.name = name;
        super.color = color;
        super.age = age;
        System.out.printf("I'm a %s cow. My name is %s. I'm %d years old.\n", color, name, age);
    }

    public void moo() {
        sound();
    }

    @Override
    public void sound() {
        System.out.println("moo");
    }
}
