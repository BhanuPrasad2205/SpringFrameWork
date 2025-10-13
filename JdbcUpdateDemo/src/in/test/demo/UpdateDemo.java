package in.test.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	public static void main(String[] args) throws Exception
	{
		int id=22;
		String name="Chintu";
		String gmail="anu@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345@");
		PreparedStatement ps=con.prepareStatement("UPDATE student SET name = ?  WHERE id = ?");
		ps.setString(1,name);
		ps.setInt(2, id);
		//ps.setString(3, gmail);
		
		int i=ps.executeUpdate();
		if(i>0)
		{
			System.out.println("Updation sucess");
		}
		else
		{
			System.out.println("Updation fail");
		}
	}
}
