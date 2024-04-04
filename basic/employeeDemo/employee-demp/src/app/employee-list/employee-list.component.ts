import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../data/employee.service';
import { Employee } from '../model/employee';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css'],
})
export class EmployeeListComponent implements OnInit {
  employees!: Employee[];
  employee!: Employee;
  deleteMessage!: string;
  employeeSave!: Employee;

  employeeForm!: FormGroup;

  constructor(
    private employeeService: EmployeeService,
    private formBuilder: FormBuilder
  ) {}

  ngOnInit(): void {
    this.getAllEmployee();
    this.forms();
  }

  forms() {
    this.employeeForm = this.formBuilder.group({
      id: ['', Validators.required],
      name: ['', Validators.required],
      department: ['', Validators.required],
    });
  }

  getAllEmployee() {
    this.employeeService.employeeList().subscribe({
      next: (v) => {
        this.employees = v;
      },
      error: (e) => {
        console.error(e);
      },
      complete: () => console.info(this.employees),
    });
  }

  deleteEmp(id: number) {
    this.employeeService.delete(id).subscribe({
      next: (v) => {},
      error: (e) => {
        console.error(e);
      },
      complete: () => {
        console.log('employee delete' + id);
        this.getAllEmployee();
      },
    });
  }

  getEmployee(id: number) {
    this.employeeService.employee(id).subscribe({
      next: (v) => {
        this.employee = v;
      },
      error: (e) => {
        console.error(e);
      },
      complete: () => console.log(this.employee),
    });
  }

  save() {
    if (this.employeeForm.valid) {
      const newEmployee = new Employee(
        this.employeeForm.value.id,
        this.employeeForm.value.name,
        this.employeeForm.value.department
      );

      console.log(newEmployee);
      this.employeeService.saveEmployee(newEmployee).subscribe({
        next: (n) => {},
        error: (e) => {},
        complete: () => {
          console.log('Saved');
          this.getAllEmployee();
        },
      });
    }
  }
}
