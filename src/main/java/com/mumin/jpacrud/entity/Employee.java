package com.mumin.jpacrud.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {

  private Long empId;
  private String empName;
  @JsonIgnore
  private Long empAge;
  private String empDepartment;


}
