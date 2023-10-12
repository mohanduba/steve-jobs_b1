package Jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InsertQuery {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null; 
		
		String dbURL = "jdbc:mysql://192.168.0.138:3306/StudentDetails";
		String userName = "root";
		String userPassword = "Mohan@858";
		String query = "select * from studentInfo";
		
		String queryInsert = "insert into studentInfo(Id,studentId,name,mobileNumber,Email,gender,"
				+ "Dob,yearOfJoin,courseId,bloodGroup,yearOfCourseCompletion)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?)";

		
		try {
			connection = DriverManager.getConnection(dbURL, userName, userPassword);
			preparedStatement = connection.prepareStatement(queryInsert);
			

			
			preparedStatement.setInt(1,6);
			preparedStatement.setInt(2,777);
			preparedStatement.setString(3,"Surya");
			preparedStatement.setLong(4,8538637587l);
			preparedStatement.setString(5,"Vamsi@gmail.com");
			preparedStatement.setString(6,"Male");
			preparedStatement.setString(7,"2002-11-15");
			preparedStatement.setInt(8,2019);
			preparedStatement.setInt(9,601);
			preparedStatement.setString(10,"A+");
			preparedStatement.setInt(11,2023);
			
			
			int resultInsert = preparedStatement.executeUpdate();
			System.out.println(": "+resultInsert);
			
			

	
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			connection.close();
			preparedStatement.close();
			
		}
		

	}

}
