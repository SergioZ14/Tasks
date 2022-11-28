package Tasks;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        sc.close();

        getSum(number);

    }

    public static void getSum(int number) {
        for (int i = 1; i <= 10; i++) {
            if (i == number) {
                System.out.println("The numbers are equal!");
            } else if (i % 2 == 0) {
                System.out.println(i + number);
            } else {
                System.out.println(i - number);
            }
        }
    }
}
