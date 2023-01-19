package Assignments.Lesson2;

public class Test {
    public static int[] searchAccount( int[] number ) {
        number = new int[15];
        for (int i = 0; i < number.length; i++)
            number[i] = number[i - 1] + number[i + 1];
        return number;
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        searchAccount(arr);
    }
    }
