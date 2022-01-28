package com.SR.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SR.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
