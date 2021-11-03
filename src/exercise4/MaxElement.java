package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        float[] numbers = new float[size];
        float max = -100;
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextFloat();
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Max number: " + max);
    }
}
