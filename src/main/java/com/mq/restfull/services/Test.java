package com.mq.restfull.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		String SQL = "select prod_name from product where id=1";
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://mquraishi.com:3306/cxfspringrestfullwebservice?user=mquraishi&password=Nopassword1");
		
			PreparedStatement preparedStatement = conn.prepareStatement(SQL);
			ResultSet resultSet = preparedStatement.executeQuery();
			String prodName ="empty";
			if(resultSet.next()){
				prodName = resultSet.getString("prod_name");
			}
			
			System.out.println(prodName);
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
