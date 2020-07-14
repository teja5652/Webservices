package com.mypackage;

import java.sql.DriverManager;
import java.sql.*;


public class EmployeeDao {

	
	public Employee Connection(int id)
	{
		Employee e = new Employee();
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sai", "1234");
			String q = "select username , password , phone from login where empid =?";
			PreparedStatement pmt = conn.prepareStatement(q);
			pmt.setInt(1, id);
			ResultSet rs = pmt.executeQuery();
			
			while(rs.next())
			{
				String name = rs.getString("username");
				//String name = rs.getString("username");
				int pass = rs.getInt("password");
				int phon = rs.getInt("phone");
				//int i = rs.getInt("empid");
				e.setUsername(name);
				e.setPassword(pass);
				e.setPhone(phon);
				e.setId(id);
				
			}
		}
					
			
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		
	
		return e;
		
	}
	public Employee CheckConnection(int id , String ename)
	{
		
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sai", "1234");
			String q = "select username , password , phone from login where empid =? and username= ?";
			PreparedStatement pmt = conn.prepareStatement(q);
			pmt.setInt(1, id);
			pmt.setString(2, ename);
			ResultSet rs = pmt.executeQuery();
			
			while(rs.next())
			{
				Employee e = new Employee();
				String name = rs.getString("username");
				int pass = rs.getInt("password");
				int phon = rs.getInt("phone");
				e.setUsername(name);
				e.setPassword(pass);
				e.setPhone(phon);
				e.setId(id);
				return e;
				
			}
		}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		return null;
		
	
		
	}
	
	public Employee Insertdata(Employee e)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "sai", "1234");
			String name = e.getUsername();
			int pass = e.getPassword();
			int phone = e.getPhone();
			int id = e.getId();
			PreparedStatement pmt = conn.prepareStatement("insert into login values(?,?,?,?)");
			pmt.setString(1, name);
			pmt.setInt(2, pass);
			pmt.setInt(3, phone);
			pmt.setInt(4, id);
			int e1 =pmt.executeUpdate();
			System.out.println("here");
			return e;
			
		  
	}
		catch (Exception e2) {
			// TODO: handle exception
		}
		return null;
	
	
}
}
