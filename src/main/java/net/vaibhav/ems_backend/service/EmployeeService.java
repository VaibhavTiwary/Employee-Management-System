package net.vaibhav.ems_backend.service;

import net.vaibhav.ems_backend.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}
