package Assignments.Lesson9;
import java.io.*;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Problem2 {
    public static void main(String[] args) {
        int count = 0;
        write("10 4 7 8 10 34 11 10 15 6 10");
        String file = readFile("problem2.txt");
        String[] arr = file.split("( )+");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            /**
             * a += Double.parseDouble(str);
             * a=a/str.size
             */
            if (arr[i].equals("10"))
                count++;
        }

        System.out.println("There is total  " + count + "  counts of number 10 inside the file");
    }

    public static void write(String str) {
        try {
            FileOutputStream fout = new FileOutputStream("problem2.txt");
            byte[] b = str.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Text file created successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static String readFile(String file) {
        String str = "";
        try {
            FileInputStream fIn = new FileInputStream(file);
            int i = 0;
            while ((i = fIn.read()) != -1) {
                str += (char) i;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    return str;
    }

}
