import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int numElements = scanner.nextInt();
        scanner.nextLine();
        return numElements;
    }

    private static int[] readElements(int numElements) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            elements[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return elements;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}