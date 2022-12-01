package basic_tasks;

public class Task2 {
    public static void main(String[] args) {
        findMinMaxAverage(10);
    }

    public static void findMinMaxAverage(int lengthOfArray) {
        int[] array = UtilClass.createRandomArray(lengthOfArray);
        int maxValue = array[0];
        int minValue = array[0];
        double sum = 0;
        for (int j : array) {
            if (j > maxValue) {
                maxValue = j;
            }
            if (j < minValue) {
                minValue = j;
            }
            sum += j;
        }
        double average = sum / array.length;
        System.out.printf("Max-value : " + maxValue + "\n" +
                "Min-value : " + minValue + "\n" +
                "Average-value : " + average);
    }
}
