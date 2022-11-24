package TestTasks;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int x = sc.nextInt();
        System.out.println("Enter width");
        int y = sc.nextInt();
        sc.close();

        drawRectangle(x, y);

    }

    public static void drawRectangle( int x, int y) {
        StringBuffer length = new StringBuffer();
        StringBuffer width = new StringBuffer();

        length.append(" ");
        for (int i = 0; i < x; i++) {
            length.append("-");
        }
        length.append(" ");

        for(int i = 0; i < y; i++) {
            width.append("|");
            for (int j = 0; j < x; j++) {
                width.append(" ");
            }
            width.append("|\n");
        }

        System.out.println(length);
        System.out.print(width);
        System.out.println(length);

    }
}
