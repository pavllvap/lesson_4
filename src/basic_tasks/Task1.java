package basic_tasks;

import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {
        deleteNumberFromArray(10);
    }

    public static void deleteNumberFromArray(int lengthOfArray) {
        int[] array = UtilClass.createRandomArray(lengthOfArray);
        int number = UtilClass.enterNumberFromScanner();
        int count = 0;
        for (int i : array) {
            if (i == number) {
                count++;
            }
        }
        int[] arrayWithoutNumber = new int[array.length - count];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                counter++;
            } else {
                arrayWithoutNumber[i - counter] = array[i];
            }
        }
        System.out.println(Arrays.toString(arrayWithoutNumber));
    }
}
