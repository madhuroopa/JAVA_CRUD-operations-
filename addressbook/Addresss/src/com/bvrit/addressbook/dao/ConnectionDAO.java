package com.bvrit.addressbook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {
	Connection conn;
	public Connection getConnection() throws ClassNotFoundException
	{
		String url = "jdbc:mysql://192.168.3.63/AddressBook_DB";
		String username = "root";
		String password = "root";
		Connection conn = null;
		try {
			//load Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			//create connection
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("successfully connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String args[]) throws Exception{
		ConnectionDAO dao = new ConnectionDAO();
		System.out.println(dao.getConnection());
	}
}
