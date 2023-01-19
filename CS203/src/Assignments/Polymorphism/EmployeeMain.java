package Assignments.Polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EmployeeMain {
    public static void main(String[] args) {

        Manager man = new Manager(122, "Ambisa", "Clerk", 5000.0);
        ArrayList<Employee> employees = new ArrayList<>();
        Clerk emp = new Clerk(113, "Tengis", "Clerk", 4500.0);

        employees.add(new Manager(114, "Ankhaa", "Manager", 6000.0));
        employees.add(new Clerk(113, "Tengis", "Manager", 4500.0));
        for (Employee e : employees) {
            e.addBonus();
            System.out.println(e.toString());
            System.out.println("");
        }

        Collections.sort(employees);
        System.out.println(employees);
    }
}

class StudentComparable implements Comparable<StudentComparable>{
    int rollno;
    String name;
    int age;
    StudentComparable(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    public int compareTo(StudentComparable st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }

}
//Creating a test class to sort the elements
class TestSort3{
    public static void someMethod(){
        ArrayList<StudentComparable> al=new ArrayList<StudentComparable>();
        al.add(new StudentComparable(101,"Vijay",23));
        al.add(new StudentComparable(106,"Ajay",27));
        al.add(new StudentComparable(105,"Jai",21));

        Collections.sort(al);
        for(StudentComparable st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
