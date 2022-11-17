package ProffesorCodes.Lesson4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TestEmp {
public static void main(String[] args) {
	
	
	//Reference variable pointing at an object
	
	
	Employee emp1= new Employee();
	
	Employee emp6 = new Employee("Peter",1000);
	Employee emp7 = new Employee("Pet",1000);
	
	System.out.println(emp6.hashCode());
	System.out.println(emp7.hashCode());
	
	emp1.setName("");
	

	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name:");
	emp1.setName(sc.nextLine());
	
	
	
	System.out.println("Enter your Salary:");
	emp1.setSalary(sc.nextFloat());
	
	
	emp1.PrintInfo();
	//Calling a static variable or method
	//You don't need to create an object
	
	
	
	System.out.println(Employee.tax);

	Employee emp2 = new Employee();
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Enter your name:");
	emp2.setName(sc2.nextLine());
	System.out.println("Enter your Salary:");
	emp2.setSalary(sc2.nextFloat());
	emp2.PrintInfo();
	emp2.PrintInfoWithTax();

	Employee.tax = 3;
	
	
	System.out.println(emp1.tax);

	System.out.println("////");
	emp2=emp1;
	System.out.println(emp1.getName());
	System.out.println(emp2.getName());
	emp2.setSalary(0);
	System.out.println(emp1.getSalary());
	System.out.println(emp1.getSalary());
	System.out.println("////");
	
	//Calling a static variable or method
	//You don't need to create an object
	System.out.println(Employee.tax);
	
	//Access modifiers
	/*Public: can be accessed from outside the class
	 * Example: setSalary
	 * Private: Cannot be access from outside the class
	 * Example: Salary
	 */

	//Another way to send values to the class is by initialization
	System.out.println("Please enter your name then your salary");
	Scanner sc3 = new Scanner(System.in);
	String  name = sc3.nextLine();
	float salary= sc3.nextFloat();
	Employee emp3 = new Employee(name,salary);
	emp3.PrintInfoWithTax();
	

	LocalDate birthday = emp3.getBirthday();
	Period age = emp3.calculateAge(birthday);
	System.out.printf("Today you are %d years, %d months" + " and %d days old%n",
			age.getYears(), age.getMonths(),
			age.getDays());

	
	Employee emp4 = SetData("Peter",1000);
	Employee emp5  = SetData("Sarah",2000);

	emp4.PrintInfo();
	emp5.PrintInfo();

	//Animal obj = new Animal(1,"Cat");

	//Shallow copying

	Person p = new Person("Person-A", "Civic");

	System.out.println("Original (orginal values): " + p.getName() + " - "+ p.getCar().getName());  

	//Clone as a shallow copy  
	Person q = (Person) p.clone(); 

	System.out.println("Clone (before change): " + q.getName() + " - "+ q.getCar().getName());  
	//change the primitive member  
	q.setName("Person-B");  
	//change the lower-level object  
	q.getCar().setName("Accord");  
	System.out.println("Clone (after change): " + q.getName() + " - "+ q.getCar().getName());  
	System.out.println("Original (after clone is modified): " + p.getName()+ " - " + p.getCar().getName()); 
}

static Employee SetData(String Name,float Salary) {
	
	Employee emp  = new Employee();
	emp.setName(Name);
emp.setSalary(Salary);
return emp;

}

}
