package com.fujitsu.loginAndRegister.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDetailsDao {
	
	public ResultSet getDetails() {
		String URL="jdbc:mysql://localhost:3306/usecase?autoReconnect=true&useSSL=false";
		String DBUSERNAME="root";
		String DBPASSWORD="root";
		
		Connection conn;
		PreparedStatement pstmt;
		String sql="select * from user";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn=DriverManager.getConnection(URL,DBUSERNAME,DBPASSWORD);
			
			pstmt= conn.prepareStatement(sql);
			
			ResultSet rs=pstmt.executeQuery();
			
			
				return rs;
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		
		
	}

}
