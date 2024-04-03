package com.cts.employee.controller;

import com.cts.employee.entity.Employee;
import com.cts.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/emp")
@CrossOrigin(origins = "*")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> employeeList(){
        return employeeService.employeeList();
    }

    @GetMapping("/{id}")
    public Employee employee(@PathVariable int id){
        return employeeService.employee(id);
    }

    @PostMapping
    public Employee employee(@RequestBody Employee employee){
        return employeeService.employee(employee);
    }

    @DeleteMapping
    public ResponseEntity<Employee> employeeDelete(@RequestParam int id){
        return new ResponseEntity<>(employeeService.employeeDelete(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Employee> employeeUpdate(@RequestParam int id, @RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.employeeUpdate(id,employee),HttpStatus.OK);
    }
}
