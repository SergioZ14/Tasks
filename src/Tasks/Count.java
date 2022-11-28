package Tasks;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        Counter counter = new Counter("Counter");
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        countEvenNumbers(number, counter);
        countOddNumbers(number, counter);

    }

    static class Counter {
        final String name;
        int count;

        public Counter(String name, int count) {
            this.name = name;
            this.count = count;
        }

        public Counter(String name) {
            this.name = name;
            this.count = 0;
        }

        int subtract() {
            return count--;
        }

        int substract(int number) {
            return count -= number;
        }

        int add() {
            return count++;
        }

        int add(int number) {
            return count += number;
        }
    }

    static void countEvenNumbers(int number, Counter counter) {
        counter.count = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                counter.add();
            }
        }
        System.out.println("Чётные числа: " + counter.count);
    }

    static void countOddNumbers(int number, Counter counter) {
        counter.count = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                counter.add();
            }
        }
        System.out.println("Нечётные числа: " + counter.count);
    }

}
