package crud.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}


//in JpaRepository<Employee, Long> : Employee is class which we need create object, Long is primary key(@Id annotation) data type.