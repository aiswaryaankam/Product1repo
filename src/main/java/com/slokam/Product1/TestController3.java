package com.slokam.Product1;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController3 {
	
	@PostMapping("Product")
	public void getproduct(@RequestBody Product product) {
		System.out.println(product);
		
	}
	
	@PostMapping("Products")
	public void getproducts(@RequestBody List<Product> product) {
		System.out.println(product);
		
	}
	

}
