package polymorphism.task2;

import polymorphism.task2.model.Animal;
import polymorphism.task2.model.Cat;
import polymorphism.task2.model.Cow;
import polymorphism.task2.model.Dog;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{new Dog("dog"), new Cat("cat"), new Cow("cow")};
        speak(animals);
    }

    private static void speak(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

}
