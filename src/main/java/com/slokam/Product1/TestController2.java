package com.slokam.Product1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
	@GetMapping("bookById")
	public String getBookById(@RequestParam(name="id") Integer id,
			@RequestParam(name="sname") String name	) {
		System.out.println("ID::" +id);
		System.out.println("Name::"+name);
		return "Hello Book";
	}
	
	@GetMapping("bookById2")
	public String getBookById2( Integer id,
			 String name) {
		System.out.println("ID::" +id);
		System.out.println("Name::"+name);
		return "Hello Book";
	}
	
	//http://localhost:8080/storyById/22/kings
	@GetMapping("storyById/{sid}/{sname}")
	public String getStoryById( @PathVariable(name="sname") String name, 
			@PathVariable(name="sid") Integer id) {
		System.out.println("Sname::"+name);
		System.out.println("Sid::"+id);
		return "Story Name";
	}

}
