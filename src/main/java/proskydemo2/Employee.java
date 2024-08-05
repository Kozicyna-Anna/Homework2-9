package proskydemo2;

import java.util.Objects;
public class Employee {

    private static int idCounter = 1;
    private final int id;
    private final String lastName ;
    private final String firstName;
    private final String surName;
    private int salary;
    private int department;
    public Employee(String firstName, String lastName, String surName, int salary, int department) {
        this.id = idCounter++;
        this.lastName = lastName;
        this.firstName = firstName ;
        this.surName = surName;
        this.salary = salary;
        this.department = department;
    }
    public int getId() {
        return id;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSurName() { return surName; }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getDepartment() {
        return department;
    }
    public void setDepartment(int department) {
        this.department = department;
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='`'" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && department == employee.department &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(firstName, employee.firstName) && Objects.equals(surName, employee.surName);
    }
    public int hashCode() {
        return Objects.hash(id, lastName, firstName, surName, salary, department);

    }
}