package proskydemo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class EmployeeController {
}
@GetMapping
public String hello() {
    return employeeService.hello();
}
@GetMapping(path = "/add")
public Employee addEmployee(@RequestParam String firstName,
                            @RequestParam String lastName,
                            @RequestParam int department,
                            @RequestParam int salary) {
    return employeeService.addEmployee(firstName, lastName, department, salary);
}

@GetMapping(path = "/remove")
public String removeEmployee (@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
    return employeeService.removeEmployee(firstName, lastName);
}
@GetMapping(path = "/find")
public Employee findEmployee (@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
    return employeeService.findEmployee(firstName, lastName);
}
@GetMapping(path = "/all")
public List<Employee> allEmployee (@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
    return employeeService.allEmployee();
}

