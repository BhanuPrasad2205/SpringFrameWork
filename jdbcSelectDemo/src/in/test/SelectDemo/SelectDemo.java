package in.test.SelectDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345@");
		PreparedStatement ps=con.prepareStatement("select *from student");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			int id=rs.getInt("id");
			System.out.println("id="+id);
			String name=rs.getString("name");
			System.out.println("name="+name);
			
			
			String gamil=rs.getString("gmail");
			System.out.println("gmail="+gamil);
			System.out.println("------------------");
		}
		con.close();
		
	}

}
