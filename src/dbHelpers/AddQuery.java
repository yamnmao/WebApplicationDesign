package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Account;


public class AddQuery {
	public Connection connection;
	
	public AddQuery(String dbName, String uname, String pwd) {
		String url = "jdbc:mysql://localhost:3306/"+dbName+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doAdd(Account account) {
		String query = "insert into Customer (CustID,Custpwd,CustLName,CustMName, CustFName,CustStAdd,CustCity,CustState,CustZip,CustEmail,CustPhone) values(?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, account.getAccountID());
			ps.setString(2, account.getPassword());
			ps.setString(3, account.getLastName());
			ps.setString(4, account.getMiddleName());
			ps.setString(5, account.getFirstName());
			ps.setString(6, account.getStreetAddress());
			ps.setString(7, account.getCity());
			ps.setString(8, account.getState());
			ps.setInt(9, account.getZipcode());
			ps.setString(10, account.getEmail());
			ps.setString(11, account.getPhone());
			
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
