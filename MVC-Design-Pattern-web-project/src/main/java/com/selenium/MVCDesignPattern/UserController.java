package com.selenium.MVCDesignPattern;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get data from database(Model)
		try {
			List<User> userItem = UserDBUtil.getUserList();
			request.setAttribute("userItems", userItem);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//redirect to the view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("show-user.jsp");
		dispatcher.forward(request, response);
		
	}

}
