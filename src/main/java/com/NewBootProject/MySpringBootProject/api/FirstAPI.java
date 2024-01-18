package com.NewBootProject.MySpringBootProject.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class FirstAPI {
	
	@RequestMapping("/testing")
	public String testJenkins(){
		return "Hey there! I am Sumit:))";
	}

}
