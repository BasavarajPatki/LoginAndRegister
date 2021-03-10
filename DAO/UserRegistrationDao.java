package com.fujitsu.loginAndRegister.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import com.fujitsu.loginAndRegister.model.User;

public class UserRegistrationDao {
	public boolean registerUser(User user) {
		System.out.println("Start of userRegistrationDAO :: registerUser");
		 String URL="jdbc:mysql://localhost:3306/usecase?autoReconnect=true&useSSL=false";
		 String DBUSERNAME="root";
		 String DBPASSWORD="root";
		

		Connection conn;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL,DBUSERNAME,DBPASSWORD);
			PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?)");
			ps.setLong(1,user.getId() );
			ps.setString(2,user.getName() );
			ps.setString(3,user.getPassword() );
			ps.setLong(4,user.getPhone() );
			ps.setString(5,user.getAddress() );
			int b=ps.executeUpdate();
			if(b > 0)
				return true;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		



		System.out.println("End of userRegistrationDAO :: registerUser");
		return false;

	}

}
