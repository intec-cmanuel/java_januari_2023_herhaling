package be.intecbrussel.model;

public class Employee {
    public String name;
    public double previousSalary;
    public double currentSalary;

    public Employee(String name, double previousSalary, double currentSalary) {
        this.name = name;
        this.previousSalary = previousSalary;
        this.currentSalary = currentSalary;
    }
}
