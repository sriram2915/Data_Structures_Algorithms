package Sorting;
import java.util.Arrays;
/**
 * Merge Sort is a divide-and-conquer algorithm that sorts an array by recursively
 * dividing it into halves, sorting each half, and then merging the sorted halves.
 * It has a time complexity of O(n log n) and is stable.
 */

class MergeSort {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length);
        
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int left, int right) {

        if (right-left==1) return;

        int mid = left + (right - left) / 2; // Find the middle point
        mergeSort(arr, left, mid); // Sort first half
        mergeSort(arr, mid, right); // Sort second half
        merge(arr, left, mid, right); // Merge the sorted halves
        
    }

    static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int[] mix = new int[right - left];
        int i = left, j = mid;
        int k = 0;

        while (i < mid && j < right) {
            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < right) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < mix.length; l++) {
            arr[left + l] = mix[l]; // Copy the sorted elements back to the original array
        }
    }
}