package net.vaibhav.ems_backend.service.impl;

import lombok.AllArgsConstructor;
import net.vaibhav.ems_backend.dto.EmployeeDto;
import net.vaibhav.ems_backend.entity.Employee;
import net.vaibhav.ems_backend.mapper.EmployeeMapper;
import net.vaibhav.ems_backend.repository.EmployeeRepository;
import net.vaibhav.ems_backend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
