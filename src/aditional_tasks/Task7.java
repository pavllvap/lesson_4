package aditional_tasks;

import basic_tasks.UtilClass;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        bubbleSortOfArray(10);
    }

    public static void bubbleSortOfArray(int lengthArray) {
        int[] array = UtilClass.createRandomArray(lengthArray);
        boolean bol = true ;
        int x;
        while (bol) {
            bol = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;
                    bol = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}



