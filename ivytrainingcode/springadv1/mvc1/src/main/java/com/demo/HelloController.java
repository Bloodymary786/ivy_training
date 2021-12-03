package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//back controller : replacement of servlet for you
@Controller
public class HelloController {
	@GetMapping(value = "hellourl")
	public ModelAndView hello() {
		ModelAndView mv=new ModelAndView();
		Employee e=new Employee(121, "raj", 56566);
		mv.setViewName("hello");
		mv.addObject("emp", e);//it automatically goes to the request scope
		return mv;
	}
}
