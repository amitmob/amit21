package com.example.rain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rain.entity.Employee;
import com.example.rain.entity.Product;
import com.example.rain.service.ProductService;

@RestController
@RequestMapping("/v1/api")
public class TestController {
	
	@Autowired
	ProductService productService;
	
	// method to save product
	@PostMapping("/saveProduct")
	public ResponseEntity<String> insertProduct(@RequestBody Product product) {
		String response = productService.saveProduct(product);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	// method to save employee
	@PostMapping("/saveEmp")
	public ResponseEntity<String> insertEmployee(@RequestBody Employee emp) {
		String response = productService.saveEmployee(emp);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	// Get controller
	@GetMapping("/getProduct/{pname}")
	public ResponseEntity<Product> getProductByName(@PathVariable("pname") String pname) {
		Product prd = productService.getProductByName(pname);
		return new ResponseEntity<Product>(prd, HttpStatus.OK);
	}
	
	// Get controller
	@GetMapping("/getProductDesc")
	public ResponseEntity<Product> getProductByDesc1(@RequestParam("pdesc") String pdesc) {
	Product prd = productService.getProductByDesc(pdesc);
	return new ResponseEntity<Product>(prd, HttpStatus.OK);
  }

	// Get controller
		@GetMapping("/showprop")
		public void displayProperties() {
		productService.displayProperties();
	}
	
	// delete product
	@DeleteMapping("/deleteproduct/{productid}")
	public ResponseEntity<String> deleteByProduct(@PathVariable("productid") Long pid) {
		String response = productService.deleteProduct(pid);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
		
		
		
		
		
		
		
		
	
	

}
