package com.users;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.utill.DBcon;


//validate user from db
public class userBDutill {

	
	public static user validate( String email , String password){
		
		
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
				 return u;
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return null;
		
	}
	//insert user for db
	
	public static boolean insertuser(String user_id, String name, String phone_no, String email, String password) {
		
		boolean isSuccess=false;
		
		Connection con = null;
		Statement stmt = null;
		

		try {
			con = DBcon.getConnection();
			stmt = con.createStatement();
			
            String sql=" INSERT INTO  users( name, phone_no, email, password) VALUES ( '"+name+"','"+phone_no+"','"+email+"','"+password+"' )";
			int rs= stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
				System.out.println("hari");
			}else {
				isSuccess=false;
				System.out.println("waradi");
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return isSuccess;
	}

	

	//update users  in db
	
	public static boolean updateuser(String user_id, String name, String phone_no, String email, String password) {
		  
		
         boolean isSuccess=false;
		
		Connection con = null;
		Statement stmt = null;
		try {
			con = DBcon.getConnection();
			stmt = con.createStatement();
			String sql="update users set name='"+name+"', phone_no='"+phone_no+"', email='"+email+"', password='"+password+"' " + " where user_id='"+user_id+"' ";
            int rs= stmt.executeUpdate(sql);
					
					
			if(rs>0) {
				isSuccess=true;
				System.out.println("true");
			}else {
				isSuccess=false;
				System.out.println("fales ");
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
		
		
		
		
		
	}
		return isSuccess;
		
		
	
   }
}



