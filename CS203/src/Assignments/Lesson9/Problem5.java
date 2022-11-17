package Assignments.Lesson9;

import java.io.FileInputStream;
import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        int count = 0;
        String file = readFile("WordBuff.txt");
        String[] arr = file.split(", ");
        System.out.println(Arrays.toString(arr));
        for (String a :arr) {
            if(isPalindrome(a)) {
                count++;
            }
        }
        System.out.println("There are " + count + " of palindrome words in a file");

    }
    public static String readFile(String file){
        String str = "";
        int count = 0;
        try {
            FileInputStream fIn = new FileInputStream(file);
            int i =0;
            while((i=fIn.read())!=-1)
                str+=(char)i;
        }catch (Exception e){
            System.out.println(e);
        }
        return str;
    }
    public static boolean isPalindrome(String str){
        String rev = "";
        boolean flag = false;
        for (int i = str.length()-1; i >=0; i--) {
            rev += str.charAt(i);
        }
        if(str.equals(rev)) {
            flag = true;
        }
        return flag;
    }
}
