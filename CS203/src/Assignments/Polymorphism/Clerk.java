package Assignments.Polymorphism;

public class Clerk extends Employee{
    public Clerk(int id, String name, String department, double salary){
        super(id,name,department,salary);
        this.bonus = 100;
    }

}
