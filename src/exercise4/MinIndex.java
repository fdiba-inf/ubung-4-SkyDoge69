package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        float[] numbers = new float[size];
        float min = 1000;
        int min_index = 0;
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextFloat();
            if (numbers[i] < min) {
                min = numbers[i];
                min_index = i;
            }
        }
        System.out.println("Min index: " + min_index);
    }
}
