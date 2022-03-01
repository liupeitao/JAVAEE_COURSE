package ty.util;

import java.sql.*;

public class DbConnect {
	public static Connection conn;
	
	public static Connection getConnect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student","root","123456");
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String args[]){
		System.out.println(DbConnect.getConnect());
	}
}
