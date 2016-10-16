package com.mq.restfull.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ws.rs.core.Response;

public class ProductServiceImpl implements ProductService {

	private Connection conn;
	
	
	public ProductServiceImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://mquraishi.com:3306/cxfspringrestfullwebservice?user=mquraishi&password=Nopassword1");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}


	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}



	public Response getProduct(String prod_id) {
		
		ProductImpl product = null;
		String SQL = "select * from product where id="+prod_id;
		System.out.println(SQL);
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(SQL);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			//building product object
			String prodName ="empty";
			String prodCategory = "empty";
			double productPrice = 0.0;
			
			if(resultSet.next()){
				prodName = resultSet.getString("prod_name");
				prodCategory = resultSet.getString("prod_category");
				productPrice = resultSet.getDouble("prod_price");
				product = new ProductImpl();
				product.setProd_name(prodName);
				product.setProd_category(prodCategory);
				product.setProd_price(productPrice);
				
				
			}
			System.out.println(prodName);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Response.ok(product).build();
	}
	
	
	
}
