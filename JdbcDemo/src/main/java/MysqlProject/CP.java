package MysqlProject;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	public static Connection createc() {
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			//create the Connection
			String user = "root"; //user of mysql
			String password = "Thanks@Prakash1"; //password of mysql
			String url = "jdbc:mysql://localhost:3306/prakash";
			con = DriverManager.getConnection(url,user,password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
