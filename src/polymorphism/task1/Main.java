package polymorphism.task1;

import polymorphism.task1.figures.Square;
import polymorphism.task1.figures.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Triangle triangle = new Triangle();

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        square.drawSquare(number);
        triangle.drawTriangle(number);
    }

}
