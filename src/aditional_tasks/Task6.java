package aditional_tasks;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        createStringArray();
    }

    public static void createStringArray() {
        String[] array = new String[]{"Vasya", "Kostya", "Sonya", "Sveta", "Kolya"};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
