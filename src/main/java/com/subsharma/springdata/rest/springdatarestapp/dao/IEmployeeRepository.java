package com.subsharma.springdata.rest.springdatarestapp.dao;

import com.subsharma.springdata.rest.springdatarestapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
}
