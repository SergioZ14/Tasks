import java.util.Scanner;

public class RecursiveSqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (number <= 0) {
            System.out.println("The number must be at least 1");
            return;
        }

        System.out.println(calculateExpression(number));
    }

    //    ������ ������� ��� ������������� ����� � ����� ����������
    static double calculateExpression(int number) {
        return calculateExpression(1, number);
    }

    //    ��������� ����������� �����, ������ �������� �������� ���������,
//    �� ������ �������� ��� ������� ������
    static double calculateExpression(int number, int maxNumber) {
        if (number == maxNumber) {
            return Math.sqrt(number);
        }

        return Math.sqrt(number + calculateExpression(number + 1, maxNumber));
    }
}
