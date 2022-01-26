package com.selenium.MVCDesignPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDBUtil {

	public static List<User> getUserList() throws ClassNotFoundException, SQLException {
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/fllblogwebsite";
		String username = "root";
		String password = "rootuser";
		
		ArrayList<User> user = new ArrayList<>();
		
		
		// load driver
		Class.forName(driver);

		// get connection
		Connection con = DriverManager.getConnection(url, username, password);
		
		// create statement
		Statement stmt = con.createStatement();

		// execute query
		ResultSet rs = stmt.executeQuery("SELECT * FROM fllblogwebsite.user");
		
		while (rs.next()) {
			int id = rs.getInt(1);
			// String avatar_img = rs.getString(2);
			String email = rs.getString(3);
			String first_name = rs.getString(4);
			// String gender = rs.getString(5);
			String last_name = rs.getString(6);
			// String password = rs.getString(7);
			String phone_number = rs.getString(8);
			String user_name = rs.getString(11);

			User u = new User(id, email, first_name, last_name, phone_number, user_name);
			
			user.add(u);
		}

		return user;
		//return new ArrayList<User>();
		
	} 
}
