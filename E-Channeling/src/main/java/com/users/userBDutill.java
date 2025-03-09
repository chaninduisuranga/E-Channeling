package com.users;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.utill.DBcon;


//validate user from database
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
				 String role= rs.getString(6);
				 String hospital= rs.getString(7);
				 
				 user u= new user (user_id,name,phone_no,dbemail,dbpassword,role,hospital);
				 return u;
			}
		}
		
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return null;
		
	}
	//insert user for database
	
	public static boolean insertuser(String user_id, String name, String phone_no, String email, String password ,String role,String hospital) {
		
		boolean isSuccess=false;
		
		Connection con = null;
		Statement stmt = null;
		

		try {
			con = DBcon.getConnection();
			stmt = con.createStatement();
			
            String sql=" INSERT INTO  users( name, phone_no, email, password) VALUES ( '"+name+"','"+phone_no+"','"+email+"','"+password+"' ,'"+role+"' , '"+hospital+"' )";
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

	

	
	
	//get all user details from session
	
	public static user getUserdetails(int user_id) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			 con = DBcon.getConnection();
			 stmt=con.createStatement();
			 String sql="SELECT * FROM users WHERE user_id='"+user_id+"' LIMIT 1";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int user_id1=rs.getInt(1);
				 String name= rs.getString(2);
				 String phone_no=rs.getString(3);
				 String dbemail= rs.getString(4);
				 String dbpassword=rs.getString(5);
				 String role= rs.getString(6);
				 String hospital= rs.getString(7);
				 
				 user u= new user (user_id1,name,phone_no,dbemail,dbpassword,role,hospital);
				 
				 con.close();
				 return u;
				
			}
			else {
				return null;
			}
			
	}
		        catch(Exception e) {
			
		        System.out.println(e);
		         return null;
	   }
	}
			//update user data
		
		public static boolean updateusers(int user_id, String name, String phone_no, String email, String password ,String role,String hospital ) {
			try {
					Connection con = DBcon.getConnection();
					Statement stmt = con.createStatement();
					String query = "UPDATE user SET name='"+name+"', phone_no='"+phone_no+"', email='"+email+"', password='"+password+"' , role='"+role+"' , hospital='"+hospital+"'  " + " where user_id='"+user_id+"' ";
					int success = stmt.executeUpdate(query);
					
					//close connection
					con.close();
		
					if(success > 0) {
						return true;
					}
					else{
						return false;
					}
			}
			catch(Exception e) {
				System.out.println(e);
				return false;
			}
		
		}
	
	
	
	}



