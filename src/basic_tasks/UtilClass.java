package basic_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class UtilClass {

    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 * (Math.random()));
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int enterNumberFromScanner (){
        System.out.println("Enter the required number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}
