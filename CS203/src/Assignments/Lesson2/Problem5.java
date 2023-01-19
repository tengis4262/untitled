package Assignments.Lesson2;

import java.util.Arrays;

public class Problem5 {
    public static boolean equalArray(int[] arr, int[] arr1){
        if(Arrays.equals(arr,arr1))
            return true;
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int [] arr1 = {1,2,3};
        System.out.println(equalArray(arr,arr1));
    }
}
