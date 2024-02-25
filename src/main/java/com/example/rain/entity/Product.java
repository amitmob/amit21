package com.example.rain.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
	
	// ID
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="productid")
	private Long productId;
	
	// Name
	@Column(name="productname", nullable=false)
	private String productName;
	
	// Desc
	@Column(name="productdesc")
	private String productDesc;
	
   // Price
	@Column(name="price")
	private Double price;
	
	// Expiry Date
	@Column(name="expirydate")
	private LocalDate expiryDate;
	
	// created
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="createdDate")
	private Date createdDate;
	
	// Getters & Setters

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
}
