package inheritance.task2.model;

public class Cow extends Animal {

    public static final String COW_NAME = "cow";

    public Cow() {
        super(COW_NAME, "moo");
    }

    public void moo() {
        sound();
    }

}
