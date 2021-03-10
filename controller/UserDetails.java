package com.fujitsu.loginAndRegister.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fujitsu.loginAndRegister.DAO.UserDetailsDao;
import com.fujitsu.loginAndRegister.model.User;

/**
 * Servlet implementation class UserDetails
 */
@WebServlet("/UserDetails")
public class UserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDetailsDao dao=new UserDetailsDao();
		
		ResultSet rs=dao.getDetails();
		User user;
		ArrayList<User> array=new ArrayList<User>();
		try {
			while(rs.next())
			{	
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
				 user = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
				 array.add(user);
			}
			HttpSession session=request.getSession();
			session.setAttribute("userlist", array);
			response.sendRedirect("admin.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
