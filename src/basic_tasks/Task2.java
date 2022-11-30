package basic_tasks;

public class Task2 {
    public static void main(String[] args) {
        findMinMaxAverage(10);
    }

    public static void findMinMaxAverage(int lengthOfArray) {
        int[] array = UtilClass.createRandomArray(lengthOfArray);
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        double average = sum / array.length;
        System.out.println("Max-value : " + maxValue);
        System.out.println("Min-value : " + minValue);
        System.out.println("Average-value : " + average);
    }
}
