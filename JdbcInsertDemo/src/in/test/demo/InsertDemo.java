package in.test.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	public static void main(String[] args) throws Exception
	{
		int id=22;
		String name="chintu";
		String gmail="chintu@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345@");
		//System.out.println("Success");
		//PreparedStatement ps=con.prepareStatement("insert into student values('"+id+"','"+name+"','"+gmail+"')");
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, gmail);
		int i=ps.executeUpdate();
		if(i>0)
		{
			System.out.println("Succes insertion");
		}
		else
		{
			System.out.println("insertion fail");
		}
		
	}

}