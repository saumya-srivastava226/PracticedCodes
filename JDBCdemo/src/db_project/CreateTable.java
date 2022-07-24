package db_project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;





public class CreateTable{
	public static void main(String args[]){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:/localhost:3306/eclipseFirstDB","root","SRIVASTAVa22#");
			Statement stmt=con.createStatement();
			String sql="create table emp1(name varchar(25),dept varchar(7),salary varchar(10))";
			stmt.executeUpdate(sql);
			System.out.println("Table is successfully created");
			con.close();
		}

		catch( ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

}