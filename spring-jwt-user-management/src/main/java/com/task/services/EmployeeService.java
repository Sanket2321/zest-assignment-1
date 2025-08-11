package com.task.services;

import com.task.payloads.EmployeeDTO;
import org.springframework.data.domain.Page;

public interface EmployeeService {

    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO employeeDTO);


    void deleteEmployee(Long employeeId);


    Page<EmployeeDTO> getAllEmployees(int page, int size, String sortBy);


    EmployeeDTO getEmployeeById(Long employeeId);


}
