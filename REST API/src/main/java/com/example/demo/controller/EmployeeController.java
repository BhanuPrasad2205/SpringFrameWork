package com.example.demo.controller;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private List<Employee> employeeList = new ArrayList<>();

  
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }

   
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeList.add(employee);
        return employee;
    }

   
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.setName(updatedEmployee.getName());
                emp.setDepartment(updatedEmployee.getDepartment());
                return emp;
            }
        }
        return null;
    }

   	
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeList.removeIf(emp -> emp.getId() == id);
        return "Employee deleted successfully!";
    }
}