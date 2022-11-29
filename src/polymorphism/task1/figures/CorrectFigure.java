package polymorphism.task1.figures;

public class CorrectFigure {
    public String a = "|";
    public String b = "/";
    public String c = "\\";
    public String d = "---";

    public void drawVerticalsLines(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(a);
            for (int j = 1; j <= number; j++) {
                System.out.print("   ");
            }
            System.out.println(a);
        }
    }

    public void drawHorizontalLine(int number) {
        System.out.print(" ");
        for (int i = 1; i <= number; i++) {
            System.out.print(d);
        }
        System.out.println();

    }

    public void drawDiagonalsLines(int number) {
        System.out.println(b + c);
        for (int i = 1; i <= number; i++) {
            System.out.print(b);
            for (int j = 1; j <= number; j += 2) {
                System.out.print("  ");
            }
            System.out.println(c);
        }
    }
}
