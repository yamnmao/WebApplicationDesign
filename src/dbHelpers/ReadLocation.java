package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import model.Products;
import model.Store;

public class ReadLocation {
	
	private Connection connection;
	private ResultSet results;
	
	private Store store = new Store();
	private int storeID;
	
	public ReadLocation(String dbName, String uname, String pwd){
		
		String url = "jdbc:mysql://localhost:3306/"+dbName+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doLocation(int storeID) {
		String query = "select * from Store where StoreID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, storeID);
			this.results = ps.executeQuery();
			this.results.next();
			
			while(this.results.next()) {
				store.setStoreID(this.results.getInt("StoreID"));
				store.setStoreAddress(this.results.getString("Store Address"));
				}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Store getstore() {
		return this.store;
	}
	
	
}
