package Assignments.Lesson2;

import java.util.Random;
import java.util.Scanner;

public class Problem4 {

    public static void maxAndMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("The maximum number of an array is :" + max);
        System.out.println("The minimum number of an array is :" + min);

    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Random ran  = new Random();

        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= -10 + ran.nextInt(21);
        }
        maxAndMin(arr);
    }
}
