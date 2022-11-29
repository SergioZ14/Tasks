package polymorphism.task2.model;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("moo");
    }

}
