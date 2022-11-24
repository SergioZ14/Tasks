package TestTasks;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x = sc.nextInt();
        sc.close();

        System.out.println(getFactorial(x));
    }

    public static BigInteger getFactorial(int x) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= x; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
