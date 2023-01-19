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
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Problem4 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println(readFile("advice.txt"));
        System.out.println("Give an advice");
        String advice = ob.nextLine();
        while(true) {
            if(advice.endsWith("\n")) {
                break;
            }
            advice = advice + "\n" + ob.nextLine();
        }
        advice = advice + "\n";
        if(advice.trim().length() == 0)
            return;
        write(advice);
        }
    public static void write(String advice){
        try {
            FileOutputStream fOut = new FileOutputStream("advice.txt",true);
            byte[] b = advice.getBytes();
            fOut.write(b);
            fOut.close();
            System.out.println("Advice added successfully");
        }catch (Exception e ){
            System.out.println(e);
        }
    }
    public static String readFile(String file){
        String str = "";
        try {
            FileInputStream fIn = new FileInputStream(file);
            int i = 0;
            while((i= fIn.read())!=-1){
                str+=(char)i;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return str;
    }
}
