package com.mumin.jpacrud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

  @GetMapping("/employees")
  public String getEmployees() {
    return "All employees in the list";
  }

  // localhost:8090/employees/12
  @GetMapping("/employees/{id}")
  public String getEmployeeById(@PathVariable("id") Long id) {
    return "Fetching the employee details for the id: " + id;
  }

  // localhost:8090/employees?id=12
  @DeleteMapping("/employees")
  public String deleteEmployee(@RequestParam("id") Long id) {
    return "Deleting the employee details for the id: " + id;
  }
}
