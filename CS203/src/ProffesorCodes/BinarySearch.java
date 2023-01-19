package ProffesorCodes;

import java.util.Arrays;

public class BinarySearch {

	// Method 1
	// Returns index of x
	// if it is present in arr[],
	// else return -1
	
	static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }

	// Method 2
	// Main driver method
	public static void main(String args[])
	{
//target = 10
	// 1, 2 ,4, 7 ,9, 10,
		//l = 0, r = 6
		//m = 0 + (6 - 0) / 2 = 3;

		//m = (5 + 0) / 2 = 2;
		// Input array
		int arr[] = {1, 2 ,4, 7 ,9, 10, 11, 1, 2, 3 };

		Arrays.sort(arr);

		// Length of array
		int n = arr.length;
		// Element to be checked if present or not
		int x = 10;

		// Calling the method 1 and
		// storing result
		int result = binarySearch(arr,0,arr.length - 1, x);

		// Element present
		if (result == -1)

			// Print statement
			System.out.println("Element not present");

		// Element not present
		else

			// Print statement
			System.out.println("Element found at index "
							+ result);
	}
}
