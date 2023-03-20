package connection;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//private là chỉ truy cập trong class
// public nơi nào cũng được
// protected chỉ trong package
public class DBconnection {
	private static String url = "jdbc:sqlserver://localhost:1433;database = dbjdbc;user = sa; password=123;encrypt=true;trustServerCertificate=true";
	
	private static Connection connection = null;
	
	public static Connection getConnect() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		connection=DriverManager.getConnection(url);

		
		return connection;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(getConnect());
	}
}
