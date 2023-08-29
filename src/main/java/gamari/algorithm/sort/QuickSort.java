package gamari.algorithm.sort;

public class QuickSort {
    public static void sort(int[] array) {
        int length = array.length;
        quickSort(array, 0, length - 1);
    }

    private static void quickSort(int[] array, int low, int high) {
        // low < highは、比較対象が2つ以上あることを意味する
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
