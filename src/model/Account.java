package model;

public class Account {
	private String accountID;
	private String password;
	private String lastName;
	private String middleName;
	private String firstName;
	private String streetAddress;
	private String city;
	private String state;
	private int zipcode;
	private String email;
	private String phone;
	/**
	 * 
	 */
	public Account() {
		this.accountID = null;
		this.password = "";
		this.lastName = "";
		this.middleName = "";
		this.firstName = "";
		this.streetAddress = "";
		this.city = "";
		this.state = "";
		this.zipcode =0;
		this.email = "";
		this.phone = "";
		
	}
	/**
	 * @param accountID
	 * @param password
	 * @param lastName
	 * @param middleName
	 * @param firstName
	 * @param streetAddress
	 * @param city
	 * @param state
	 * @param zipcode
	 * @param email
	 * @param phone
	 */
	public Account(String accountID, String password, String lastName, String middleName, String firstName,
			String streetAddress, String city, String state, int zipcode, String email, String phone) {
		this.accountID = accountID;
		this.password = password;
		this.lastName = lastName;
		this.middleName = middleName;
		this.firstName = firstName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.email = email;
		this.phone = phone;
	}
	/**
	 * @return the accountID
	 */
	public String getAccountID() {
		return accountID;
	}
	/**
	 * @param accountID the accountID to set
	 */
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}
	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zipcode
	 */
	public int getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	



	
	
	
	

}
