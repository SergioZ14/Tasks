package inheritance.task2.model;

public class Animal {
    private final String name;
    private final String sound;

    public Animal(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    protected void sound() {
        System.out.println(sound);
    }

    public String getAnimalName() {
        return name;
    }

}
