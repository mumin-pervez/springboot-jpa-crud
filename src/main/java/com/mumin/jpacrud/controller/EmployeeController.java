package com.mumin.jpacrud.controller;

import com.mumin.jpacrud.entity.Employee;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  // localhost:8090/employees
  @GetMapping("/employees")
  public String getEmployees() {
    return "All employees in the list";
  }

  // localhost:8090/employees/12
  @GetMapping("/employees/{id}")
  public String getEmployeeById(@PathVariable("id") Long id) {
    return "Fetching the employee details for the id: " + id;
  }

  @PostMapping("/employee")
  public String saveEmployee(@RequestBody Employee employee) {
    return "Employee is saved" + employee;
  }

  // localhost:8090/employees/13
  @PutMapping("/employees/{empId}")
  public String updateEmployee(@PathVariable Long empId, @RequestBody Employee employee) {
    return "Employee info is updated for " + empId;
  }

  // localhost:8090/employees?id=12
  @DeleteMapping("/employees")
  public String deleteEmployee(@RequestParam("id") Long id) {
    return "Deleting the employee details for the id: " + id;
  }
}
