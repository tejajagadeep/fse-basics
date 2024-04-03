import { Component, OnInit } from '@angular/core';
import { Employee } from '../model/employee';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../data/employee.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css'],
})
export class UpdateEmployeeComponent implements OnInit {
  employee!: Employee;

  employeeForm!: FormGroup;

  constructor(
    private employeeService: EmployeeService,
    private formBuilder: FormBuilder,
    private route: ActivatedRoute
  ) {}

  ngOnInit(): void {
    const id = this.route.snapshot.params['id'];
    this.getEmployee(id);
    this.forms();
  }

  forms() {
    this.employeeForm = this.formBuilder.group({
      id: ['', Validators.required],
      name: ['', Validators.required],
      department: ['', Validators.required],
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
      complete: () =>
        (this.employeeForm = this.formBuilder.group({
          id: this.employee.id,
          name: this.employee.name,
          department: this.employee.department,
        })),
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
        },
      });
    }
  }
}
