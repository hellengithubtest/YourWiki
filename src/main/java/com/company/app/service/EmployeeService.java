package com.company.app.service;

import com.company.app.entity.Employee;
import com.company.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public  EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Transactional
    public void createEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    @Transactional
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
