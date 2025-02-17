package com.users;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.utill.DBcon;



public class userBDutill {

	
	public static List<user> validate ( String email , String password){
		
		
		ArrayList<user> us = new ArrayList<>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		
		try {
			con = DBcon.getConnection();
			stmt = con.createStatement();

			String sql=" select * from users where email='"+email+"'  AND  password='"+password+"'"  ;
			rs = stmt.executeQuery(sql);
			
			
			if(rs.next()) {
				int user_id=rs.getInt(1);
				 String name= rs.getString(2);
				 String phone_no=rs.getString(3);
				 String dbemail= rs.getString(4);
				 String dbpassword=rs.getString(5);
				 
				 user u= new user (user_id,name,phone_no,dbemail,dbpassword);
				 us.add(u);
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return us;
	}
}
