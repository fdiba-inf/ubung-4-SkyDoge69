package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        char[] array = new char[size];

        for (int i = 0; i < size; i++) {
            array[i] = input.next().charAt(0);
        }

        char[] result = new char[size];
        int i = 0;
        for (int k = size; k != 0 ; k--) {
            result[i] = array[k - 1];
            i++;
        }

        String output = Arrays.toString(result);
        System.out.println("Reversed symbols: " + output);

    }
}
