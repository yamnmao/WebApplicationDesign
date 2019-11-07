package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import model.Products;

public class ReadRecord {
	
	private Connection connection;
	private ResultSet results;
	
	private Products product = new Products();
	private int productID;
	
	public ReadRecord(String dbName, String uname, String pwd, int productID){
		
		String url = "jdbc:mysql://localhost:3306/"+dbName+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		this.productID = productID;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doRead() {
		String query = "select * from Product where ProdID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, this.productID);
			this.results = ps.executeQuery();
			this.results.next();
			
			product.setProdID(this.results.getInt("ProdID"));
			product.setProdName(this.results.getString("ProdName"));
			product.setProdPrice(this.results.getDouble("ProdPrice"));
			product.setProdQuant(this.results.getInt("Prodquant"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Products getproduct() {
		return this.product;
	}
	
	
}
