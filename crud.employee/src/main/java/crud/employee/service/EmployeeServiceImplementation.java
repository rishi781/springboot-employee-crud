package crud.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.employee.entity.Employee;
import crud.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
	
	@Autowired
	EmployeeRepository repo;
	
	@Override
	public void createNewEmployee(Employee emp) {
		repo.save(emp); // will give the object to Repository, inserting one data into database
		
	}
	
	@Override
	public Employee searchEmployee(Long id) {
		return repo.findById(id).get();
	}
	
	@Override
	public void updateEmployee(Employee emp) {
		repo.save(emp); 
		
	}
	

	@Override
	public void deleteEmployee(Long id) {
		repo.deleteById(id); 
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

}

//deleteById this method is used because to delete data by id(primary key).
//findById  this method is used because to search or retrieve data by id(primary key).
