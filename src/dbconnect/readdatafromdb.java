package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class readdatafromdb 
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		Connection con = DriverManager.getConnection("jdbc:sqlserver://root@localhost/QA");
		
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from employeeinfo where name='nam'");
		while(rs.next());
		{
		//point to next index
		System.out.println(rs.getString("location"));
		}
	}
}
