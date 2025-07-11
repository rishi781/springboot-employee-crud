package crud.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import crud.employee.entity.Employee;
import crud.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/create")
	public void createNewEmployee(@ModelAttribute Employee emp) {
		service.createNewEmployee(emp);
	}
	
	//this for displaying data on console
//	@GetMapping("/search")
//	public Employee searchEmployee(Long id) { // if you are passing single data it is optional you can use get or post request.
//		// so why we are using return type as Employee because to retrieve all information of employee by using id we will retrieve all information of employee.
//		Employee emp = service.searchEmployee(id);
//		System.out.println(emp);
//		return emp; // This method is used to display information on console not on front-end(web).
//		
//		// so why we are using return type as Employee because to retrieve all information of employee by using id we will retrieve all information of employee. 
////		return service.searchEmployee(id); // This method is used to display information on console not on front-end(web).
//	}
	
	//this is for displaying data on front-end(client or web Browser).
	@GetMapping("/search")
	public String searchEmployee(Long id, Model model) { //import org.springframework.ui.Model;
		Employee emp = service.searchEmployee(id);
		model.addAttribute("empObj", emp);
		return "searchResult"; //internally look for searchResult.html file
	}
	
	@PostMapping("/update")
	public void updateEmployee(@ModelAttribute Employee emp) {
		service.updateEmployee(emp);
	}
	
	@GetMapping("/delete")
	public void deleteEmployee(Long id) { // if you are passing single data it is optional you can use get or post request.
		service.deleteEmployee(id);
	}
	
	@GetMapping("/viewAll")
	public String getAllEmployees(Model model) {
		List<Employee> empList = service.getAllEmployees();
		System.out.println(empList);
		model.addAttribute("empList", empList);
		return "viewAll"; //internally look for viewAll.html file
	}
	
	
	
	@GetMapping("/createPage")
	public String createPage() {
		return "create"; //internally look for create.html file
	}
	
	@GetMapping("/searchPage")
	public String searchPage() {
		return "search"; //internally look for search.html file
	}
	
	@GetMapping("/updatePage") 
	public String updatePage() {
		return "update"; //internally look for update.html file
	}
	
	@GetMapping("/deletePage") 
	public String deletePage() {
		return "delete"; //internally look for delete.html file
	}
}

//@RequestBody: this annotation is used when you are accepting data from postman.
//@ModelAttribute: this annotation is used when you are accepting data from html page.
//whenever we are sending the control from controller to the front-end that time one object is automatically actted one in-build or pre-defined object is automatically attaced to response this object is known as model object.
//the role of model object is to transfer data from back-end(server) to the front-end(client or web browser).






