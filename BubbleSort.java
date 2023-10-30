public class BubbleSort {
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    // Swap arr[i-1] and arr[i]
                    T temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void main(String[] args) {
        Integer[] intArr = {64, 34, 25, 12, 22, 11, 90};
        String[] strArr = {"we got that apple apple", "where is my zebra", "12 banana", "no orange!", "grape"};

        System.out.println("Original Integer Array:");
        printArray(intArr);
        bubbleSort(intArr);
        System.out.println("Sorted Integer Array:");
        printArray(intArr);

        System.out.println("\nOriginal String Array:");
        printArray(strArr);
        bubbleSort(strArr);
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
