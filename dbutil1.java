package preparedstatement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbutil1 {
	 private static Connection con;
	 private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	 private static final String DB_USERNAME="root";
	 private static final String DB_PASSWORD="mysql8";
	 private static final String DB_URL="jdbc:mysql://localhost:3306/bankDb";
	 public static Connection getConnection() {
		 try {
			 Class.forName(DB_DRIVER_CLASS);//to load database driver
			 System.out.println("driver loaded successfully...");
			 
			 //connect database
			 con = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			 System.out.println("connection established successfully");
		 }catch(ClassNotFoundException e) {
			 System.out.println("error.........."+ e.getMessage());
			 //e.printStackTrace();
		 }catch(SQLException e) {
			 System.out.println("error.........."+ e.getMessage());
		 }
		return con;
	 }
}