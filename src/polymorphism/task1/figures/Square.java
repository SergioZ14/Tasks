package polymorphism.task1.figures;

public class Square extends CorrectFigure {

    public void drawSquare(int number) {
        drawHorizontalLine(number);
        drawVerticalsLines(number);
        drawHorizontalLine(number);
    }

}
