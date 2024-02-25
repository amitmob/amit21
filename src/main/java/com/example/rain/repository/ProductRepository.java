package com.example.rain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.rain.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	Product findByProductName(String productname);
	
	// query
	@Query(value="select * from product where productdesc=:productdesc", nativeQuery = true)
	Product getByProductDesc(@Param("productdesc") String productDesc);
}
