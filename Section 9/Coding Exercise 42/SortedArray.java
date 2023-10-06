import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int size) {
        int[] integers = new int[size];
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            integers[i] = scanner.nextInt();
        }
        return integers;
    }

    public static int[] sortIntegers(int[] integers) {
        int[] sortedArray = Arrays.copyOf(integers, integers.length);
        Arrays.sort(sortedArray);
        int[] reverseSortedArray = new int[sortedArray.length];
        
        for (int i = 0; i < sortedArray.length; i++) {
            reverseSortedArray[i] = sortedArray[sortedArray.length - 1 - i];
        }
        
        return reverseSortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}