package Jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			String dbURL = "jdbc:mysql://192.168.0.138:3306/StudentDetails";
			String userName ="root";
			String password = "Mohan@858";
			String query = "select * from EmployeeInfo";
			
			connection = DriverManager.getConnection(dbURL, userName, password);
			statement = connection.createStatement();		
			resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
			System.out.println(resultSet.getString("empRole"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
