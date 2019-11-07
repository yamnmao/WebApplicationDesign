package model;

public class Products {
	private int prodID;
	private String prodName;
	private double prodPrice;
	private int prodQuant;
	
	public Products() {
		this.prodID = 0;
		this.prodName = "";
		this.prodPrice = 0;
		this.prodQuant = 0;
	}

	/**
	 * @param prodID
	 * @param prodCategory
	 * @param prodName
	 * @param prodPrice
	 * @param prodQuant
	 */
	public Products(int prodID,String prodName, double prodPrice, int prodQuant) {
		this.prodID = prodID;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQuant = prodQuant;
	}

	/**
	 * @return the prodID
	 */
	public int getProdID() {
		return prodID;
	}

	/**
	 * @param prodID the prodID to set
	 */
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}

	/**
	 * @return the prodName
	 */
	public String getProdName() {
		return prodName;
	}

	/**
	 * @param prodName the prodName to set
	 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	/**
	 * @return the prodPrice
	 */
	public double getProdPrice() {
		return prodPrice;
	}

	/**
	 * @param prodPrice the prodPrice to set
	 */
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	/**
	 * @return the prodQuant
	 */
	public int getProdQuant() {
		return prodQuant;
	}

	/**
	 * @param prodQuant the prodQuant to set
	 */
	public void setProdQuant(int prodQuant) {
		this.prodQuant = prodQuant;
	}
	
	
	

}
