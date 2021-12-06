package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
// api/hello
@Controller
@RequestMapping(path="api")
public class HelloController {
	
	//ModelAndView vs ModelMap vs Model
	
	@GetMapping(path = "hello2")
	public void hello2(Model map) {
		map.addAttribute("data", "spring mvc hello world using model");// whatever data u are adding here it goes to request scope and hence retive on jsp by using EL
		//return "helloview";
	}
	
	@GetMapping(path = "hello1")
	public String hello1(ModelMap map) {
		map.addAttribute("data", "spring mvc hello world using modelmap");// whatever data u are adding here it goes to request scope and hence retive on jsp by using EL
		return "helloview";
	}
	
	
	@GetMapping(path = "hello")
	public ModelAndView hello(ModelAndView mv) {
		mv.setViewName("helloview");
		mv.addObject("data", "spring mvc hello world");// whatever data u are adding here it goes to request scope and hence retive on jsp by using EL
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//RequestParam and pathvariable
	
	//pathvariable:mainly used in REST application 
	
	//api/hellopath/anil/chennai
	@GetMapping(path = "hellopath/{name}/{address}")
	public ModelAndView helloPath(ModelAndView mv, 
			@PathVariable(name = "name") String eName, 
			@PathVariable(name="address")String eAddress) {
		
		System.out.println(eName);
		System.out.println(eAddress);
		mv.setViewName("helloview");
		mv.addObject("data", "spring mvc hello world");// whatever data u are adding here it goes to request scope and hence retive on jsp by using EL
		return mv;
	}
	
	//RequestParam: it is mainly used in REST application 
	//api/helloparam?name=raj&address=delhi
	@GetMapping(path = "helloparam")
	public ModelAndView helloParm(ModelAndView mv, 
			@RequestParam(name="name", required = false, defaultValue = "foo")String name,
			@RequestParam(name="address", required = false, defaultValue ="india" )String address) {
		System.out.println(name);
		System.out.println(address);
		mv.setViewName("helloview");
		mv.addObject("data", "spring mvc hello world");// whatever data u are adding here it goes to request scope and hence retive on jsp by using EL
		return mv;
	}
	
}
