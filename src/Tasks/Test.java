package Tasks;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sc.nextInt();
        System.out.println("Enter b:");
        b = sc.nextInt();
        sc.close();

        System.out.println((Math.pow(a, 3) > Math.pow(b , 2)) ? "a^3 > b^2" : "a^3 < b^2");
    }
}
