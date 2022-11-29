package polymorphism.task1.figures;

public class Triangle extends CorrectFigure {

    public void drawTriangle(int number) {
        drawDiagonalsLines(number);
        drawHorizontalLine(number);
    }

}
