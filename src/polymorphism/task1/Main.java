package polymorphism.task1;

import polymorphism.task1.figures.Square;
import polymorphism.task1.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Triangle triangle = new Triangle();
        square.drawSquare(7);
        triangle.drawTriangle(5);
    }

}
