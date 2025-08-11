package com.task.services.impl;

import com.task.entities.Employee;
import com.task.exceptions.ResourceNotFoundException;
import com.task.payloads.EmployeeDTO;
import com.task.repositories.EmployeeRepository;
import com.task.services.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = this.modelMapper.map(employeeDTO, Employee.class);
        Employee savedEmployee = this.employeeRepository.save(employee);
        return this.modelMapper.map(savedEmployee, EmployeeDTO.class);
    }

    @Override
    public EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO employeeDTO) {
        Employee employee = this.employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "Employee Id", employeeId));

        employee.setName(employeeDTO.getName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setDepartment(employeeDTO.getDepartment());
        employee.setPosition(employeeDTO.getPosition());
        employee.setSalary(employeeDTO.getSalary());
        employee.setDateOfJoining(employeeDTO.getDateOfJoining());

        Employee updatedEmployee = this.employeeRepository.save(employee);
        return this.modelMapper.map(updatedEmployee, EmployeeDTO.class);
        //suppose we dont use model mapper here so we need to write lot of biolerplate code
        //like this
       /* EmployeeDTO dto = new EmployeeDTO();
        dto.setId(updatedEmployee.getId());
        dto.setName(updatedEmployee.getName());
        dto.setEmail(updatedEmployee.getEmail());
        dto.setDepartment(updatedEmployee.getDepartment());
        dto.setPosition(updatedEmployee.getPosition());
        dto.setSalary(updatedEmployee.getSalary());
        dto.setDateOfJoining(updatedEmployee.getDateOfJoining());
        return dto;  */

    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee = this.employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "Employee Id", employeeId));

        this.employeeRepository.delete(employee);
    }


    @Override
    public Page<EmployeeDTO> getAllEmployees(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return this.employeeRepository.findAll(pageable)
                .map(emp -> this.modelMapper.map(emp, EmployeeDTO.class));
    }

    @Override
    public EmployeeDTO getEmployeeById(Long employeeId) {
        Employee employee = this.employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee", "Employee Id", employeeId));
        return this.modelMapper.map(employee, EmployeeDTO.class);
    }

}
