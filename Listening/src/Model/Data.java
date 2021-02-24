package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Data {
	private static String connection_DB = "jdbc:sqlserver://den1.mssql8.gear.host:1433;databaseName=invictustest;user=invictustest;password=test@123";
	
	public static String[] Read(String query) {
		String[] value = new String[2];
		
		try {
			Connection conn = DriverManager.getConnection(connection_DB);
			Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	
	        rs.next();
	        value[0] = rs.getString("name");
	        value[1] = rs.getString("phone");
	    }
	    catch (SQLException e) {
	        e.printStackTrace();
	        value[0] = "";
	    }
		return value;
	}
	
	public static int Write(String query) {
		int rs;
		
		try {
			Connection conn = DriverManager.getConnection(connection_DB);
			Statement stmt = conn.createStatement();
			rs = stmt.executeUpdate(query);
		}
		catch (SQLException e) {
			e.printStackTrace();
			rs = 0;
		}
		
		return rs;
	}
}
