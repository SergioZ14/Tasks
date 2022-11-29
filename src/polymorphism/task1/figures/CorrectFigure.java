package polymorphism.task1.figures;

public class CorrectFigure {
    private static final String A = "|";
    private static final String B = "/";
    private static final String C = "\\";
    private static final String D = "---";

    public void drawVerticalsLines(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(A);
            for (int j = 1; j <= number; j++) {
                System.out.print("   ");
            }
            System.out.println(A);
        }
    }

    public void drawHorizontalLine(int number) {
        System.out.print(" ");
        for (int i = 1; i <= number; i++) {
            System.out.print(D);
        }
        System.out.println();

    }

    public void drawDiagonalsLines(int number) {
        StringBuilder sb = new StringBuilder();
        String s = "  ";
        for (int i = 1; i < number; i++) {
            sb.append(s);
        }
        sb.append(B);
        sb.append(C);
        System.out.println(sb);

        for (int i = 1; i < number; i++) {
            sb.insert(number, s+s);
            sb.delete(0,1);
            System.out.println(sb);
        }
    }
}
