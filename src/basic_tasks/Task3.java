package basic_tasks;

public class Task3 {
    public static void main(String[] args) {
        averageValueForTwoArrays(5, 5);
    }

    public static void averageValueForTwoArrays(int array1Length, int array2Length) {
        int[] array1 = UtilClass.createRandomArray(array1Length);
        int[] array2 = UtilClass.createRandomArray(array2Length);

        double sum1 = 0;
        for (int i : array1) {
            sum1 += i;
        }
        double average1 = sum1 / array1.length;
        System.out.println(average1);

        double sum2 = 0;
        for (int i : array2) {
            sum2 += i;
        }
        double average2 = sum2 / array2.length;
        System.out.println(average2);

        if (average1 > average2) {
            System.out.println("Average value of array1 bigger than average of array2");
        } else if (average1 < average2) {
            System.out.println("Average value of array2 bigger than average of array1");
        } else {
            System.out.println("Average values are equal");
        }
    }
}
