package aditional_tasks;

import basic_tasks.UtilClass;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        createArray(10);
    }

    public static void createArray(int arrayLength){
        int [] array1 = UtilClass.createRandomArray(arrayLength);
        int [] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++){
            if (i%2 != 0){
                array2[i] = 0;
            }else {
                array2[i] = array1[i];
            }
        }
        System.out.println(Arrays.toString(array2));
    }


}
