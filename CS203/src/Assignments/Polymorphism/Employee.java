package Assignments.Polymorphism;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name,department;
    protected double salary;
    protected double bonus=200.0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee() {
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.bonus = 200;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
//        return department.equals(employee.department);
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public void addBonus(){
        salary+=bonus;
    }
    public String toString(){
        return String.format("ID: %d\nName: %s\nDepartment: %s\n" +
                "Salary: $%,.2f" , id,name,department,salary);
    }

    @Override
    public int compareTo(Employee o) {
        int diffId =  id - o.id;

        if(diffId != 0)
            return diffId;

        return name.compareTo(o.name);
    }
}
