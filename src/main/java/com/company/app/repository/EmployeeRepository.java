package com.company.app.repository;

import com.company.app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Long> {

    List<Employee> findByLastName(String lastName);

    @Query("SELECT * FROM Employees")
    Long getMaxId();
}
