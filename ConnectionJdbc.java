package Test;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.jms.Connection;

public class ConnectionJdbc {
	public static Connection getConn() {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/softwarestu";
		String username="root";
		String password="123456";
		Connection conn=null;
		try {
			Class.forName(driver);
			conn=(Connection)DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
