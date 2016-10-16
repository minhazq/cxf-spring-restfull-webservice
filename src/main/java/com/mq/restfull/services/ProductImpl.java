package com.mq.restfull.services;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="product")
public class ProductImpl implements Product{

	private String prod_name;
	private String prod_category;
	private double prod_price;
	
	
	
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_category() {
		return prod_category;
	}
	public void setProd_category(String prod_category) {
		this.prod_category = prod_category;
	}
	public double getProd_price() {
		return prod_price;
	}
	public void setProd_price(double prod_price) {
		this.prod_price = prod_price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
