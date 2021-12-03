package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@Autowired
	private EmployeeService employeeService;
	//@PathVariable vs @RequestParam

	//demo?username=amit&address=delhi
	@GetMapping(path="demo")
	public ModelAndView helloMethod2(@RequestParam(name = "username")String name,
			@RequestParam(name = "address")String address ) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("mypage2");
		mv.addObject("username", name);
		mv.addObject("address",address);
		return mv;
	}
	
	
	@GetMapping(path="employee/{id}")
	public ModelAndView helloMethod(@PathVariable(name = "id")int id) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("mypage");
		mv.addObject("message", "I am the champion");
		mv.addObject("employee", employeeService.getById(id));
		return mv;
	}
}








