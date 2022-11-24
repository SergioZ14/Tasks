package TestTasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();
        sc.close();

        if (a % 2 == 0) {
            System.out.println(a*b);
        } else if (a % 2 != 0) {
            System.out.println(a/b);
        } else System.out.println("Числа равны!");
    }

}



