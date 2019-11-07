package model;

public class Store {
	private int storeID;
	private String storeAddress;
	
	
	public Store() {
		this.storeID = 0;
		this.storeAddress = null;
	}
	/**
	 * @param storeID
	 * @param storeAddress
	 */
	public Store(int storeID, String storeAddress) {
		this.storeID = storeID;
		this.storeAddress = storeAddress;
	}
	/**
	 * @return the storeID
	 */
	public int getStoreID() {
		return storeID;
	}
	/**
	 * @param storeID the storeID to set
	 */
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	/**
	 * @return the storeAddress
	 */
	public String getStoreAddress() {
		return storeAddress;
	}
	/**
	 * @param storeAddress the storeAddress to set
	 */
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	
	

}
