package aditional_tasks;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        createStringArray();
    }

    public static void createStringArray() {
        String[] array = new String[5];
        array[0] = "Vasya";
        array[1] = "Kostya";
        array[2] = "Sonya";
        array[3] = "Sveta";
        array[4] = "Kolya";
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
