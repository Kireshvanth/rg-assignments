package com.kireshvanth.Employee_SpringBoot_JPA.repository;

import com.kireshvanth.Employee_SpringBoot_JPA.model.Employee ;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
