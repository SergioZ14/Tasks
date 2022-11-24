package TestTasks;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int x = sc.nextInt();
        sc.close();

        System.out.println(getSum(x));
    }

    public static int getSum(int x) {
        int a = 0;
        for (int i = 1; i <= x; i++) {
            a += i;
        }
        return a;
    }
}
