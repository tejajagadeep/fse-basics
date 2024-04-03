package com.cts.employee.service;

import com.cts.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> employeeList();

    Employee employee(int id);

    Employee employee(Employee employee);

    Employee employeeDelete(int id);

    Employee employeeUpdate(int id, Employee employee);
}
