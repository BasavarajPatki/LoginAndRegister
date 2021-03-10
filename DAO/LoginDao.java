package com.fujitsu.loginAndRegister.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

	public boolean verifyUserCredentials(String username,String password) {

		String URL="jdbc:mysql://localhost:3306/usecase?autoReconnect=true&useSSL=false";
		String DBUSERNAME="root";
		String DBPASSWORD="root";
		
		Connection conn;
		PreparedStatement pstmt;
		String sql="select * from user where Name=? and Password=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn=DriverManager.getConnection(URL,DBUSERNAME,DBPASSWORD);
			
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				return true;
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
}
