package com.sportyshoes1.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase_report")
public class PurchaseReport implements Serializable{


	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int purproductid;
    private String purproductname;
    private String purcustomerEmail;
    private String purdate;
    private int purproductprice;
    private String purproductcategory;
    
	public PurchaseReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPurproductid() {
		return purproductid;
	}

	public void setPurproductid(int purproductid) {
		this.purproductid = purproductid;
	}

	public String getPurproductname() {
		return purproductname;
	}

	public void setPurproductname(String purproductname) {
		this.purproductname = purproductname;
	}

	public String getPurcustomerEmail() {
		return purcustomerEmail;
	}

	public void setPurcustomerEmail(String purcustomerEmail) {
		this.purcustomerEmail = purcustomerEmail;
	}

	public String getPurdate() {
		return purdate;
	}

	public void setPurdate(String purdate) {
		this.purdate = purdate;
	}

	public int getPurproductprice() {
		return purproductprice;
	}

	public void setPurproductprice(int purproductprice) {
		this.purproductprice = purproductprice;
	}

	public String getPurproductcategory() {
		return purproductcategory;
	}

	public void setPurproductcategory(String purproductcategory) {
		this.purproductcategory = purproductcategory;
	}

	@Override
	public String toString() {
		return "PurchaseReport [purproductid=" + purproductid + ", purproductname=" + purproductname
				+ ", purcustomerEmail=" + purcustomerEmail + ", purdate=" + purdate + ", purproductprice="
				+ purproductprice + ", purproductcategory=" + purproductcategory + "]";
	}
	
	
	
}
