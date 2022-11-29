package inheritance.task2;

import inheritance.task2.model.Animal;
import inheritance.task2.model.Cat;
import inheritance.task2.model.Cow;
import inheritance.task2.model.Dog;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Murka", "grey", 7);
        animals[1] = new Dog( "Bobik", "black", 3);
        animals[2] = new Cow("Burenka", "brown", 10);
        animals[3] = new Dog("Zhuchka", "ginger", 6);
        speak(animals);

    }

    private static void speak(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sound();

        }
    }

}
