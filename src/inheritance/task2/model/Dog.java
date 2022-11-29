package inheritance.task2.model;

public class Dog extends Animal {
    public static final String DOG_NAME = "dog";

    public Dog() {
        super(DOG_NAME, "woof");
    }

    public void woof() {
        sound();
    }
}
