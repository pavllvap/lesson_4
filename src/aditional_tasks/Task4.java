package aditional_tasks;

import basic_tasks.UtilClass;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        createArrayWithEvenNumbers();
    }

    public static void createArrayWithEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] array = null;
        int length = 0;
        boolean b = true;
        System.out.println("Enter the length of array, from range 5 < length <= 10 : ");
        while (b) {
            length = scanner.nextInt();
            if (5 < length && length <= 10) {
                array = UtilClass.createRandomArray(length);
                b = false;
            } else {
                System.out.print("Your length out of range 5 < length <= 10" + "\n" +
                        "Please repeat enter of length :" + "\n");
            }
        }
        int count = 0;
        for (int i : array) {
            if (i%2 == 0) {
                count ++;
            }
        }
        System.out.println("Amount of even numbers : " + count);
        int[] arrayWithEvenNumbers = new int[count];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                arrayWithEvenNumbers[counter] = array[i];
                counter++;
            }
        }
        System.out.println(Arrays.toString(arrayWithEvenNumbers));
    }
}
