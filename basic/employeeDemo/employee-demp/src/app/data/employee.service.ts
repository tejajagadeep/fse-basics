import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Employee } from '../model/employee';
import { API_URI_EMP } from '../app-contants';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class EmployeeService {
  constructor(private http: HttpClient) {}

  employeeList(): Observable<Employee[]> {
    return this.http.get<Employee[]>(`http://localhost:8080/v1/emp`);
  }

  employee(id: number): Observable<Employee> {
    return this.http.get<Employee>(`http://localhost:8080/v1/emp/${id}`);
  }

  delete(id: number) {
    const params = new HttpParams().set('id', id);
    return this.http.delete(`http://localhost:8080/v1/emp`, { params });
  }

  saveEmployee(emp: Employee): Observable<Employee> {
    return this.http.post<Employee>(`http://localhost:8080/v1/emp`, emp);
  }
}
