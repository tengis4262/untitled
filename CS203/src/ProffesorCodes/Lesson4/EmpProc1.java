package ProffesorCodes.Lesson4;

import java.util.Scanner;

public class EmpProc1 {
	
	static String Name="";
	static float Salary = 0f;
	
	public static void main(String[] args) {
		AskEmpName();
		AskEmpSalary();
		System.out.println("Your name is " + Name + ", your salary is "+ Salary + "$");
			
	}
		static void AskEmpName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		 Name =sc.nextLine();
		
	}
	
	static void AskEmpSalary() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Salary:");
		 Salary =sc.nextFloat();
		
	}
	

}
