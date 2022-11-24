package TestTasks;

import java.util.Scanner;

public class Wrong {
    public static void main(String[] args) {
        getNumber();

    }

    public static void getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        do {
            System.out.println("guessed wrong!");
            System.out.println("Enter your number");
            number = sc.nextInt();
        } while (number != 1);
            sc.close();

    }
}
