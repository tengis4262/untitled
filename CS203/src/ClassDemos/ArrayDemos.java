package ClassDemos;

import java.util.Scanner;

//import Lesson2.Employee;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayDemos {


    public static void main (String[ ]args) {
        // The final keyword means the value of the variable can't be changed while the app is running
        final int size = 5;

        int arr[] = new int[size];


        for (int i = 0 ; i<size;i++) {
            System.out.println("Please Enter Element # " + (int)(i+1));
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int item : arr) {
            sum+= item;
        }



        System.out.println("The total is " + sum );




        System.out.println("The average is " + (sum/arr.length) );




        //1. Copying arrays
        int arr2[]= arr;



        for(int item:arr2) {
            System.out.println(item);
        }
        arr[0]=1;
        System.out.println(arr2[0]);



        //2. Copying arrays
        int arr3[] = new int[size];


        for(int i = arr.length-1 ;i >=0;i--) {

            arr3[i] = arr[i];
        }
        System.out.println("test");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr3));

        //3. Copying array
        //arraycopy(Object src, int srcPos,Object dest, int destPos, int length)


        int arr4[] = new int[size];



        System.arraycopy(arr, 0, arr4, 0, arr.length);


        System.out.println(Arrays.toString(arr4));

        int arr5[] = new int[3];
        System.arraycopy(arr, 1, arr5, 1, 2);
        System.out.println(Arrays.toString(arr5));




        //4. Copying array
        //copyOfRange(src,fromIndex, toIndex)
        int[] arr6 = Arrays.copyOfRange(arr, 0, arr.length);
        int[] arr7 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("destination = " + Arrays.toString(arr6));
        System.out.println("destination = " + Arrays.toString(arr7));



        //Array List
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist

        ArrayList<String> ll = new ArrayList<String>();
        for(int i =0 ; i <4;i++) {
            ll.add("Hi");
        }
        System.out.println(ll);

        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Traversing list through for-each loop

        System.out.println(list.size());

        for(String fruit:list)
            System.out.println(fruit);


        for (int i =0 ; i < list.size();i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0
        //changing the element




        list.set(1,"Dates");


        //Traversing list
        for(String fruit:list)
            System.out.println(fruit);
        //Sorting the list




        Collections.sort(list);


        //Traversing list through the for-each loop
        for(String fruit:list)
            System.out.println(fruit);



        System.out.println("Traversing list through List Iterator:");
        //Here, element iterates in reverse order
        ListIterator<String> ite=list.listIterator( );
        while(ite.hasNext())
        {
            String str=ite.next();
            System.out.println(str);
        }



        System.out.println("Traversing list through for loop:");
        for(int i=0;i<list.size();i++)
        {
            //To update the values inside the arraylist
            String str = list.get(i).substring(0,3);
            list.set(i, str);
            System.out.println(list.get(i));


        }




        ArrayList<String> al=new ArrayList<String>();

        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add("Anuj");
        al.add("Gaurav");



        System.out.println("An initial list of elements: "+al);



        //Removing specific element from arraylist
        al.remove("Vijay");



        System.out.println("After invoking remove(object) method: "+al);
        //Removing element on the basis of specific position
        al.remove(0);


        System.out.println("After invoking remove(index) method: "+al);

        //Creating another arraylist
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        //Adding new elements to arraylist
        al.addAll(al2);



        System.out.println("Updated list : "+al);
        //Removing all the new elements from arraylist
        al.removeAll(al2);
        System.out.println("After invoking removeAll() method: "+al);
        //Removing elements on the basis of specified condition
        al.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression
        System.out.println("After invoking removeIf() method: "+al);
        //Removing all the elements available in the list
        al.clear();
        System.out.println("After invoking clear() method: "+al);

    }



}