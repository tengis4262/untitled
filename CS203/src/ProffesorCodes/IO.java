package ProffesorCodes;
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

public class IO {
    public static void main(String[] args) {

//
//        BufferedWriter("Buffer Writer111","BufferWriter1.txt");
//
//        BufferedWriter("Buffer Writer" + "\n" + "222","BufferWriter1.txt");





    write("\n\n65");
        //readall("problem2.txt");


        //overloading
        //write("Java#");

        //write("Testing...","test.txt");


        //reading the first character

        //Using full path on mac (Global Path)

        ///Users/sanadaburass/eclipse-workspace/OOP/testout.txt


      //  System.out.println(readchar("/Users/sanadaburass/eclipse-workspace/OOP/testout.txt"));


        //reading all string
       // System.out.println(readall("testout1.xml"));
        //BufferedOutputStream Class
        //It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.

        //Local Folder:  Files/BufferedText.txt

       // WriteBuffer("Hello","BufferedText.txt");
        //BufferedInputStream
        //When the bytes from the stream are skipped or read, the internal
        //buffer automatically refilled from the contained input stream, many bytes at a time.
        //When a BufferedInputStream is created, an internal buffer array is created.

       // System.out.println(ReadBuffer("BufferedText.txt"));
        //SequenceInputStream
        //used to read data from multiple streams. It reads data sequentially

       // System.out.println(ReadSequence("test.txt","BufferedText.txt"));
        //Reading from multiple files

//        Vector v=new Vector();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many files do you have?");
//        int num = sc.nextInt();
//        for (int i = 1;i<=num;i++) {
//            try {
//                System.out.println("Please Enter File NAme #" + i);
//                Scanner sc2 = new Scanner(System.in);
//                String filename = sc2.nextLine();
//
//                FileInputStream fin=new FileInputStream(filename);
//                v.add(fin);
//            }
//            catch(Exception e) {
//
//
//
//            }
//
//        }
//        //creating enumeration object by calling the elements method
//        Enumeration e=v.elements();
//        System.out.println(ReadingfromMultipleFiles(e));
//
//        //BufferedWriter  is used to provide buffering for Writer instances.
//        //It makes the performance fast. It inherits Writer class.
//        //The buffering characters are used for providing the efficient writing
//        //of single arrays, characters, and strings.
//
//
//        BufferedWriter("Buffer Writer","BufferWriter.txt");
//
//        //class is used to read the text from a character-based input stream.
//        //It can be used to read data line by line by readLine() method. It makes the performance fast
//        System.out.println(BufferedReader("BufferWriter.txt"));
//        // Buffered Reader Read Line
//        System.out.println("Hi " +readline());
//
//        //Printer writer
//        PrinterWriter("Hello Java");
//        PrinterWriter("Hello "+ readline());


    }


    static void write(int id) {
        try{
            FileOutputStream fout=new FileOutputStream("problem2.txt");


            fout.write(id);

            fout.close();
            System.out.println("success...");
        }
        catch(Exception e){System.out.println(e);}
    }





    static void write(String str) {
        try{
            FileOutputStream fout=new FileOutputStream("problem2.txt");

            byte b[]=str.getBytes();//converting string into byte array


            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }



    static void write(String str,String file) {
        try{
            FileOutputStream fout=new FileOutputStream(file);

            byte b[]=str.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(Exception e){System.out.println(e);}
    }

    static char readchar(String file) {
        int i=0;
        try{
            FileInputStream fin=new FileInputStream(file);
            i=fin.read();

            fin.close();


        }catch(Exception e){System.out.println(e);}
        return (char)i;

    }
    static String readall( String file) {
        String str= "";
        try{

            FileInputStream fin=new FileInputStream(file);
            int i=0;

            while((i=fin.read())!=-1){

                str +=(char)i;

            }
            fin.close();

        }catch(Exception e){System.out.println(e);}
        return str;
    }

    static void WriteBuffer(String str,String file) {

        try {



            FileOutputStream fout=new FileOutputStream(file);
            BufferedOutputStream bout=new BufferedOutputStream(fout);

            byte b[]=str.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("success");
        }
        catch (Exception e) {
            // TODO: handle exception
        }
    }

    static String ReadBuffer(String file) {
        String str = "";
        try{
            FileInputStream fin=new FileInputStream(file);
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1){
                str +=(char)i;
            }
            bin.close();
            fin.close();
        }catch(Exception e){System.out.println(e);}
        return str;

    }




    static String ReadSequence(String file1, String file2) {
        String str= "";
        try {
            FileInputStream input1=new FileInputStream(file1);

            FileInputStream input2=new FileInputStream(file2);



            SequenceInputStream inst=new SequenceInputStream(input1, input2);
            int j=0;
            while((j=inst.read())!=-1){
                str+= (char)j;
            }
            inst.close();
            input1.close();
            input2.close();
        }
        catch(Exception e){

        }
        return str;



    }
    static String ReadingfromMultipleFiles(Enumeration enumr)  {
        String str= "";
        try {
            SequenceInputStream bin=new SequenceInputStream(enumr);
            int i=0;
            while((i=bin.read())!=-1){
                System.out.println(i);
                str+=(char)i;
            }
            bin.close();
        }
        catch (Exception e)
        {

        }
        return str;

    }


    static void BufferedWriter(String str,String file)  {
        try {
            FileWriter writer = new FileWriter(file);
            BufferedWriter buffer = new BufferedWriter(writer);
            // it also writes array of characters
            //char chars[] = {'J','a','v','a'};
            buffer.write(str);
            buffer.close();
            System.out.println("Success");
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    static String BufferedReader(String file) {
        String str = "";
        try {
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            Scanner cc = new Scanner(fr);
            cc.hasNextLine();

            int i;
            while((i=br.read())!=-1){
                str +=(char)i;
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return str;


    }

    static void PrinterWriter(String str) {
        PrintWriter writer = new PrintWriter(System.out);
        writer.write(str);
        writer.flush();
        writer.close();
    }
    static String readline() {
        String str = "";
        try {

            InputStreamReader r=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(r);
            System.out.println("Enter your name");
            str=br.readLine();

        } catch (Exception e) {
            // TODO: handle exception
        }
        return str;

    }
}


