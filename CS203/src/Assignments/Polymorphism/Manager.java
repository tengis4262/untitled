package Assignments.Polymorphism;

public class Manager extends Employee {
    public Manager(int id, String name, String department, double salary){
        super(id,name,department,salary);
        this.bonus = 300;
    }
}
