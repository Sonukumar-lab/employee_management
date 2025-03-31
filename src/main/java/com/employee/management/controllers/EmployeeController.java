package com.employee.management.controllers;

import com.employee.management.models.Employee;
import com.employee.management.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        List<Employee> employees =employeeService.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
        return employees;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        System.out.println(employee.toString());
        System.out.println(employee.getName());
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        System.out.println(id);
        employeeService.deleteEmployee(id);
    }
}
