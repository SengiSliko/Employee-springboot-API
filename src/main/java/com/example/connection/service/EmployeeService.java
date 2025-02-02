package com.example.connection.service;

import com.example.connection.DTO.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long EmployeeId);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(Long employeeId, EmployeeDto UpdatedEmployee);
    void deleteEmployee(Long employeeId);
}
