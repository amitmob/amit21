package com.example.rain.service;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.rain.config.MessageConfig;
import com.example.rain.entity.Employee;
import com.example.rain.entity.Product;
import com.example.rain.repository.EmployeeRepository;
import com.example.rain.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	MessageConfig messageConfig;
	
	@Value("${info.app.name}")
	private String appName;
	
	@Value("${info.app.description}")
	private String appDesc;
	
	@Value("${info.app.version}")
	private Integer appVersion;
	
	// taking property from propeties file
	//@Value("${greet.hello.there}")
	//private String greetHello;
	
//	@Value("${from.conduent}")
	//private String fromCond;
	
	// Method to save product
	public String saveProduct(Product pro) {
		System.out.println("Saving Product Details......");
		LocalDate expiryDate = LocalDate.of(2024, 02, 18);
		Product product = new Product();
		product.setProductName(pro.getProductName());
		product.setProductDesc(pro.getProductDesc());
		product.setPrice(pro.getPrice());
		product.setExpiryDate(expiryDate);
		product.setCreatedDate(new Date());
		productRepository.save(product);
		return "Product Saved Succeefully..!!!";
	}
	
	// Method to get product
	public Product getProductByName(String pname) {
		System.out.println("Getting Product Details By Name......" + pname);
		if(pname != null || pname.equals("")) {
			Product product =  productRepository.findByProductName(pname);
			return product;
		} 
		return null;
		
	}
	
	
	
	// method to get product desc
	public Product getProductByDesc(String pdesc) {
		System.out.println("Getting Product Details By Desc......" + pdesc);
		if(pdesc != null || pdesc.equals("")) {
			Product prd1 = productRepository.getByProductDesc(pdesc);
			return prd1;
		}
		return null;
	}
	
	// method to display properties
	public void displayProperties() {
		System.out.println("Displaying Properties......");
//		System.out.println(greetHello + fromCond);
		System.out.println("Info App Name......" + appName);
		System.out.println("Info App Desc......" + appDesc);
		System.out.println("Info App Version......" + appVersion);
		System.out.println("Calling  MsgBbean......");
		String msg = messageConfig.MsgBean();
		System.out.println("Bean Msg......" + msg);
	}
	
	// method to save employee
	public String saveEmployee(Employee e) {
		System.out.println("Saving Employee ......");
		Employee emp = new Employee();
		emp.setEmpName(e.getEmpName());
		emp.setEmpDept(e.getEmpDept());
		emp.setSalary(e.getSalary());
		employeeRepository.save(emp);
		return "Employee Successfully Saved....";
	}
	
	// method to delete productt
	public String deleteProduct(long id) {
		String msg = "Product Successfully Deleted.....";
		productRepository.deleteById(id);
		return msg;
	}
	
	
	
	
	
	

}
