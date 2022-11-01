package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson1 {
//    ArrayList<String> list = new ArrayList<>();

    public static int aveArr(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/(arr.length);

    }
    public static int evenCount(int[] arr){
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0)
                count++;
        }
        return count;
    }
    public static int oddCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 != 0)
                count++;
        }
        return count;
    }
    public static void printEven(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printOdd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 != 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    public static boolean isTrue(String[] str , String word){
//        for (int i = 0; i < str.length; i++) {
//            if(word.equalsIgnoreCase(str[i]))
//                return true;
//            }
//        return false;
//    }
    public static void isTrue(String[] str , String word){
        for (int i = 0; i < str.length; i++) {
            if(word.equalsIgnoreCase(str[i]))
                System.out.println("Yes item in stock");
            else
                System.out.println("We don't have this item in stock");
        }
    }
    public static int maxNum(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    public static void reverseArray(String[] arr) {
//        String[] newArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length()-1; j >= 0; j--) {
                System.out.print(arr[i].charAt(j) + "");
            }
            System.out.print(" ");

        }
        System.out.println();
    }
    public static ArrayList<String> revArray(String[] arr){
        ArrayList<String> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            String word = "";
            for (int j = arr[i].length()-1; j >= 0 ; j--) {
                word += arr[i].charAt(j);
            }
            newArr.add(word);
        }
        return newArr;
    }


    /*
    for(int i = (givenString.length() -1); i >= 0; i--){
            //reversedString += givenString.charAt(i);
            System.out.print(givenString.charAt(i));
     */


    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter size of an array of String");
        int m = ob.nextInt();
        String[] arrList = new String[m];
        System.out.println("Enter words one by one");
        for (int i = 0; i <arrList.length; i++) {
            arrList[i]= ob.next();
        }
        reverseArray(arrList);
        System.out.println(revArray(arrList));
        System.out.println("Enter size of an array");
        int n = ob.nextInt();
        int[] arr = new int[n];
        String[] market = {"egg","banana","milk","bread","beef","chicken","jam","cookies","cola","pepsi"};
        System.out.println("Enter numbers one by one");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= ob.nextInt();
        }
//        int[] arr1 = {1,2,3,4};
        System.out.println("The average of numbers of array is : " + aveArr(arr));
        System.out.println("Even numbers in your array : " + evenCount(arr));
        System.out.println("Odd numbers in your array : " + oddCount(arr));
        System.out.println("The max number in array is : " + maxNum(arr));
        System.out.println("The even numbers in array are: ");
        printEven(arr);
        System.out.println("The odd numbers in array are:");
        printOdd(arr);
        System.out.println("Check if Item is in stock at the market ");
        String check = ob.next();
        isTrue(market,check);
        /*
        isTrue (ArrList, check);
         */

    }
}
