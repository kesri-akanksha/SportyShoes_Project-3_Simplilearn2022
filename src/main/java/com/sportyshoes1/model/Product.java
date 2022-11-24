package com.sportyshoes1.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productid;
	private String productname;
	private int productprice;
	private String productcategory;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productid, String productname, int productprice, String productcategory) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productcategory = productcategory;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ ", productcategory=" + productcategory + "]";
	}
	
	

}
