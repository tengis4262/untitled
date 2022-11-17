package ProffesorCodes.Lesson4;

import java.util.Scanner;

public class EmpProc2 {
	static String Name="";
	static float Salary = 0f;
	
	public static void main(String[] args) {
		AskEmpName();
		AskEmpSalary();
		float tax = Salary * 0.25f;
		
		System.out.println("Your name is " + Name + ", your salary is "+ Salary + "$, you sould pay "+ tax + " as taxes");
			
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
