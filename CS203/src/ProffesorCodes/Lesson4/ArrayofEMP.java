package ProffesorCodes.Lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayofEMP {
public static void main(String[] args) {
    int arr[] = new int [2];
    Employee Emparr[] = new Employee[2];

  for (int i = 0 ; i<2;i++) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please Enter The Name and Salary of Employe #" + (int)(i+1) );
	  Employee Emp0 = new Employee();

	   Emp0.setName(sc.nextLine());
	   Emp0.setSalary(sc.nextFloat());
	Emparr[i] = Emp0;    
  }
  
  for (Employee em : Emparr)
	  System.out.println(em.getName());

  float Stat [] = SalaryTotal(Emparr);

  for(int i = 0;i<Stat.length;i++) {
	   switch(i){
	   case 0: System.out.print("Total Salaries: ");
	   
	   case 1: System.out.print("Min Salary: ");
	   case 2: System.out.print("Max Salary : ");
	   
	   }
	   System.out.println(Stat[i]);
  }
  

  ArrayList <Employee> EmpList = new ArrayList<Employee>();

  for (int i = 0 ; i<3;i++) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Please Enter The Name and Salary of Employe #" + (int)(i+1) );
	   Employee Emp = new Employee();
	   Emp.setName(sc.nextLine());
	   Emp.setSalary(sc.nextFloat());
	   EmpList.add(Emp);    
   }   

  ListIterator<Employee> itr=EmpList.listIterator();  
  
  //traversing elements of ArrayList object  
  while(itr.hasNext()){  
    Employee em=(Employee)itr.next();  
    System.out.println(em.getName()+" "+" "+em.getSalary());  
  } 

}

static float[] SalaryTotal(Employee Emparr[] ){
	float sum = 0;
	
	float min = Emparr[0].getSalary();
	float max = Emparr[0].getSalary();
	
	
	float Stat[] =new float[3];
	
	for (int i  = 0 ;i<Emparr.length;i++) {
		
		
		sum+= Emparr[i].getSalary();
		
		
		if (Emparr[i].getSalary()>max){
			max = Emparr[i].getSalary();
			}
		if (Emparr[i].getSalary()<min) {
			min = Emparr[i].getSalary();

		}
	}
	
	Stat[0] = sum;
	Stat[1] = min;
	Stat[2] = max;
return Stat;
}
}
