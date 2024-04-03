package com.cts.employee.service;

import com.cts.employee.entity.Employee;
import com.cts.employee.repository.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> employeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee employee(int id) {
        return employeeRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Override
    public Employee employee(Employee employee) {
        if(employeeRepository.findById(employee.getId()).isPresent()){
            throw new DataIntegrityViolationException("ID Already Exists");
        }
        return employeeRepository.save(employee);
    }

    @Override
    public Employee  employeeDelete(int id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        employeeRepository.deleteById(id);
        return employee;
    }

    @Override
    public Employee employeeUpdate(int id, Employee employee) {

        Employee newEmployee = employeeRepository.findById(id).orElseThrow(EntityNotFoundException::new);

        return employeeRepository.save(employee);
    }
}
