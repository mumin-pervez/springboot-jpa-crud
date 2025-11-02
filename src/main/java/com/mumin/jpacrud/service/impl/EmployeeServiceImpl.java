package com.mumin.jpacrud.service.impl;

import com.mumin.jpacrud.entity.Employee;
import com.mumin.jpacrud.service.EmployeeService;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  private static List<Employee> list = new ArrayList();

  static {
    Employee employee = new Employee();
    employee.setEmpName("Feroz Ahmed");
    //employee.setEmpAge(32);
    employee.setEmpDepartment("Testing");
    list.add(employee);
  }

  @Override
  public List<Employee> getEmployees() {
    return list;
  }
}
