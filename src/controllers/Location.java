package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.ReadLocation;
import model.Store;

/**
 * Servlet implementation class Location
 */
@WebServlet(
		name = "LocationServlet", 
		urlPatterns = { 
				"/LocationServlet", 
				"/location"
		})
public class Location extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Location() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//get the data
		int storeID = Integer.parseInt(request.getParameter("zipcode"));
		
		//create an object
		Store store = new Store();
		
		//set up a ReadLocation object
		ReadLocation rl = new ReadLocation("retail","root","520hailaier");
		rl.doLocation(storeID);
		String url = "";
		
		//check the existence of store
		store = rl.getstore();
		String check = store.getStoreAddress();
		if(storeID == 30605 || storeID == 30620) {
		    	url = "/landing page 1.html";
		    }
		    else {
		    	url = "/landing page 2.html";
		    	request.setAttribute("store", store);
		    	
		    }
		 
		 RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		 dispatcher.forward(request, response);
		
		
		
		
	}

}
