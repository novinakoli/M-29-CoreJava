package org.stjohn.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//this database contains the necessary database information
public class StudentDAO {
	/*A connection (session) with a specificdatabase. 
	 * SQL statements are executed and results are 
	 * returnedwithin the context of a connection. 
	 */
	public Connection createConnection()
	{
		//to connect with the database
		String url="jdbc:mysql://127.0.0.1:3306/fastandfurious";
		String username="root";
		String password="W@2915djkq#";
		
		try {
			/*if the driver class is an incorrect then
			 * it will be handle by using catch block 
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) 
		{
			System.out.println("Invalid Driver Class Name");
		}
		
		Connection connection;
		try {
		connection=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			System.out.println("Invalid Credentials");
		}
		return null;
		
	}

}
