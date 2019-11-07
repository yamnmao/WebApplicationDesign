package dbHelpers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Account;

public class AccountQuery {
	
	private Connection connection;
	private ResultSet results;
	
	private Account account = new Account();
	private String accountID;
	
	public AccountQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/"+dbName+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		// set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doLogin(String accountID, String pwd ){
		String query = "select * from Customer where CustID = ? and Custpwd =? ";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			ps.setString(1, accountID);
			
			// call the password service from the secure login example to encrypt the password
			// use the encrypted passwrod in the query instead of the clear text pwd
			ps.setString(2, pwd);
			
			this.results= ps.executeQuery();
			
			while(this.results.next()) {
			
			account.setAccountID(this.results.getString("CustID"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public Account getAccount() {
		
		return this.account;
			
	}
	
	

}

