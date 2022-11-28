package Tasks;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int x = sc.nextInt();
        sc.close();
        System.out.println(calculateFactorial(x));
    }

    static int calculateFactorial(int x) {

        if (x == 1) {
            return x;
        }

        return x * calculateFactorial(x - 1);
    }
}
