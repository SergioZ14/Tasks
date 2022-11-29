package inheritance.task2;

import inheritance.task2.model.Animal;
import inheritance.task2.model.Cat;
import inheritance.task2.model.Cow;
import inheritance.task2.model.Dog;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{new Dog(), new Cat(), new Cow()};
        speak(animals);



    }

    private static void speak(Animal[] animals) {
        for (Animal animal : animals) {
            sound(animal);
        }
    }

    private static void sound(Animal animal) {
        switch (animal.getAnimalName()) {
            case Cat.CAT_NAME:
                ((Cat) animal).meow();
                break;
            case Dog.DOG_NAME:
                ((Dog) animal).woof();
                break;
            case Cow.COW_NAME:
                ((Cow) animal).moo();
                break;
            default:
                System.out.println("Unknown animal");

        }

    }

}
