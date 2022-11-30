package basic_tasks;


public class Task0 {
    public static void main(String[] args) {
        printIsArrayIncludeNumber(10);
    }

    public static void printIsArrayIncludeNumber(int lengthOfArray) {
        int[] array = UtilClass.createRandomArray(lengthOfArray);
        int number = UtilClass.enterNumberFromScanner();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("This number is in the array.");
                break;
            } else if (i == (array.length - 1)) {
                System.out.println("This number isn't in the array.");
            }
        }
    }
}








