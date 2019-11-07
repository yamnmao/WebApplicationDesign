package model;

import java.util.ArrayList;

import dbHelpers.ReadRecord;

public class Cart {
	
	ArrayList <Products> product = new ArrayList <Products>();
	Products e = new Products();
	int prodID = 0;
	public void addProduct(int prodID) {
		// query to get product information
		// make a product object
		// add the product to the array list
		
		//create ReadRecord class
		ReadRecord rr = new ReadRecord("retail","root","520hailaier",prodID);
		//Use ReadRecord to get the product data
		rr.doRead();
		e = rr.getproduct();
		product.add(e);
				
	}
	
	public void removeProduct(int prodID) {
		ReadRecord rr = new ReadRecord("retail","root","520hailaier",prodID);
		//Use ReadRecord to get the product data
		rr.doRead();
		e = rr.getproduct();
		product.remove(e);
		
	}
	
	public String getArrayList() {
		String info = "";
		int store = 0;
		 for(Products list : product) {
			 	store = list.getProdID();
	            info += list.getProdName() +"  "+"Price: $"+ list.getProdPrice() +"      "+"Quantity: "+ list.getProdQuant();
	            info += "<form name=\"remove\" action=\"remove\" method=\"post\"> "+
	            "<input name=\"prodID\" type=\"hidden\" value=\""+store+"\"/>" +
	            "<input type=\"submit\" name=\"submit\" value=\"Remove\">"+"</form> " + "<br>";
		 }
		return info;
	}
	
	public int getProductsID() {
		 for(Products list : product) {
	           prodID = list.getProdID();
	        }
		return prodID;
	}
	

	
	

}
