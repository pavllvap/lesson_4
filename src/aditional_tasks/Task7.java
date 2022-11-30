package aditional_tasks;

import basic_tasks.UtilClass;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        bubbleSortOfArray(10);
    }

    public static void bubbleSortOfArray(int lengthArray) {
        int[] array1 = UtilClass.createRandomArray(lengthArray);
        int[] array2 = new int[array1.length];
        boolean bol = true ;
        int x = 0;

        while (bol) {
            bol = false;
            for (int i = 0; i < array1.length - 1; i++) {
                if (array1[i] > array1[i + 1]) {
                    x = array1[i];
                    array1[i] = array1[i + 1];
                    array1[i + 1] = x;
                    bol = true;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
    }


}



