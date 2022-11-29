package inheritance.task2.model;

public class Cat extends Animal {
    public static final String CAT_NAME = "cat";

    public Cat() {
        super(CAT_NAME, "meow");
    }

    public void meow() {
        sound();
    }

}
