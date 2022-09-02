package fr.m2i.rest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import fr.m2i.rest.model.Employee;
import fr.m2i.rest.service.EmployeeService;

@Controller
//@RequestMapping(value=)
public class PageController {
	
	@Autowired
	EmployeeService es;
	
	@GetMapping(name="homePage", value="/")
	public String home(Model model) {
		/**ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Calo","gero"));
		employees.add(new Employee("Lea","Barel"));
		employees.add(new Employee("Mica","Cora"));**/
		
		model.addAttribute("hello","hello the world!");
		//model.addAttribute("employees",es.getEmployees());
	
		//model.addAttribute("employee",new Employee());
		return "home";
		// return new ModelAndView("home","message");
	}
	
	@GetMapping("/form")
	public String postGet(@ModelAttribute Employee employee,Model model) {
		
		model.addAttribute("employees",es.getEmployees());
		return "form";
	}
	
	@PostMapping("/form")
	public String display(@ModelAttribute Employee employee) {
		System.out.println(employee.getFirstname());
		System.out.println(employee.getLastname());
		return "form";
	}
	
	@PostMapping("/add")
	public String addEmployee(@ModelAttribute Employee employee) {
		System.out.println(employee.getFirstname());
		System.out.println(employee.getLastname());
		es.add(employee);
		return "redirect:/form";
	}
	
	@PostMapping("/delete")
	public String deleteEmployee(@ModelAttribute Employee employee,@RequestParam(value = "index") int index) {
		System.out.println(employee.getFirstname());
		System.out.println(employee.getLastname());
		System.out.println(index);
		//System.out.println(index);
		es.delete(index);
		return "redirect:/form";
	}
	


}
