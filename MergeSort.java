import java.util.Arrays;

public class MergeSort {
    public static <T extends Comparable<T>> void mergeSort(T[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        T[] left = Arrays.copyOfRange(arr, 0, mid);
        T[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static <T extends Comparable<T>> void merge(T[] arr, T[] left, T[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) < 0) {
                arr[resultIndex++] = left[leftIndex++];
            } else {
                arr[resultIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            arr[resultIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            arr[resultIndex++] = right[rightIndex++];
        }
    }

    public static void main(String[] args) {
        Integer[] intArr = {64, 34, 25, 12, 22, 11, 90};
        String[] strArr = {"apple", "zebra", "banana", "orange", "grape"};

        System.out.println("Original Integer Array:");
        printArray(intArr);
        mergeSort(intArr);
        System.out.println("Sorted Integer Array:");
        printArray(intArr);

        System.out.println("\nOriginal String Array:");
        printArray(strArr);
        mergeSort(strArr);
        System.out.println("Sorted String Array:");
        printArray(strArr);
    }

    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
