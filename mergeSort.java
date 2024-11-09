import java.util.Arrays;
import java.util.Random;

public class mergeSort {

    public static void main(String[] args) {
        int[] arrBestCase = generateSortedArray(10000);
        int[] arrWorstCase = generateReverseSortedArray(10000);
        int[] arrAverageCase = generateRandomArray(10000);
        
        long startTime = System.nanoTime();
        mergeSort1(arrBestCase.clone());
        long bestCaseTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        mergeSort1(arrWorstCase.clone());
        long worstCaseTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        mergeSort1(arrAverageCase.clone());
        long averageCaseTime = System.nanoTime() - startTime;

        System.out.println("Merge Sort Time Complexity Analysis (array size: 10000)");
        System.out.println("Best Case Time: " + bestCaseTime + " ns");
        System.out.println("Worst Case Time: " + worstCaseTime + " ns");
        System.out.println("Average Case Time: " + averageCaseTime + " ns");
    }

    public static void mergeSort1(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        mergeSort1(left);
        mergeSort1(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static int[] generateSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static int[] generateReverseSortedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i;
        }
        return arr;
    }

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }
        return arr;
    }
}