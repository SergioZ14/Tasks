package Tasks;

import java.util.Scanner;

public class MasInt {
    public static void main(String[] args) {
        int[] array = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number");
            array[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1) {
                System.out.println(array[i] + array[0]);
            } else System.out.println(array[i] + array[i+1]);
        }

    }

}
