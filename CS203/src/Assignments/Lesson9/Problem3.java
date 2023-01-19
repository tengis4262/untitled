package Assignments.Lesson9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter file name followed by extention");
        String fileName = ob.nextLine();
        double avg = findAvg(fileName);
        System.out.printf("The average of numbers inside the file is : %.2f", avg);
    }
    public static double findAvg(String file){
        double b = 0;
        String s = read(file);
        String[] arr = s.split("( )*(\\r\\n)+( )*");
        System.out.println("ARRAY: "+Arrays.toString(arr));
        int length = arr.length;
        for (String a:arr) {
            System.out.println("String: '"+a + "'");
            double d = Double.parseDouble(a);
            b+=d;
        }
        return b/ length;
    }


    public static String read(String file){
        String str = "";
        try {
            FileInputStream fIn = new FileInputStream(file);
            int i = 0;
            while((i=fIn.read())!=-1)
            str+=(char)i;
            fIn.close();
        }catch (Exception e){
            System.out.println(e);
        }
        return str;
    }
}
