package Assignments.Lesson3;

import java.util.Arrays;

public class BinarySearch {
    public  int binarySearch(int[] arr, int low, int high, int key) {
        System.out.println("Length of the array is: " + arr.length);
        int mid = low+ (high-low) / 2;
        if (high < low)
            return -1;
        else if (arr[mid] == key)
            return mid;
        else if (arr[mid] > key)
            return binarySearch(arr,low,mid - 1, key);
        else
            return binarySearch(arr,mid + 1, high, key);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        BinarySearch bn = new BinarySearch();
        //bn.binarySearch();
    }
}

