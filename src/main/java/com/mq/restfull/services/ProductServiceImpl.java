package com.mq.restfull.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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



	public Product getProduct(String prod_id) {
		String SQL = "select prod_name from product where id="+prod_id;
		System.out.println(SQL);
		try {
			PreparedStatement preparedStatement = conn.prepareStatement(SQL);
			ResultSet resultSet = preparedStatement.executeQuery();
			String prodName ="empty";
			if(resultSet.next()){
				prodName = resultSet.getString("prod_name");
			}
			System.out.println(prodName);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
