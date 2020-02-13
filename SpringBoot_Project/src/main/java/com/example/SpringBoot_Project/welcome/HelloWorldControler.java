package com.example.SpringBoot_Project.welcome;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControler {
	
//	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	@GetMapping("/hello-world")
	public String Helloworld()
	{
		return "Hellow Springboot Example.";
	}
	@GetMapping("/hello-worldBean")
	public HelloWorldBean HelloworldBean()
	{
		return new HelloWorldBean("Welcome CTS");
	}
	@GetMapping("/hello-worldBean/path-varible/{id}")
	public HelloWorldBean HelloworldBeanPathVarible(@PathVariable int id)
	{
		return new HelloWorldBean(String.format("Welcome CTS %s",id));
	}

}
