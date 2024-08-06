package proskydemo2;

import java.awt.*;
import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService {
    private static final int MAX_EMPLOYEES = 10;

    private final List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Sergey", "Ivanov", 1, 30000);
            new Employee("Oleg","Semenov",2,28_000);
            new Employee("Alexander","Petrov",2,4600);
            new Employee("Roman","Samsonov",3,37000);
            new Employee("Igor","Romanov",1,400_000)
    ));

    public String hello() {
        return "Добро пожаловать в программу!";
    }
    @Override
    public Employee addEmployee(String firstName, String lastName, int departmentId, int salary) {
        Employee employee = new Employee(firstName, lastName, departmentId, salary);
        if (employees.size() >= MAX_EMPLOYEES) {
            throw new EmployeeStorageIsFullException();
        } else if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException();
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public String removeEmployee(String firstName, String lastName) {
        boolean removed = employees.removeIf(p -> p.getFirstName().equals(firstName) && p.getLastName().equals(lastName));
        if (removed) {
            return "Сотрудник " + firstName + " " + lastName + " удален.";
        }
        return "Сотрудник " + firstName + " " + lastName + " не найден!";
    }
}
@Override
public Employee findEmployee(String firstName, String lastName) {
    return employee.stream()
            .filter(e -> e.getFirstName().equsls(firstName) && e.getLastName().equals(lastName));
            .findFirst
            .orElseThrow(() -> new EmployeeNotFoundException());
}
@Override
public List<Employee> allEmployees() {
    return employees;
}
}







