package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AccountQuery;
import model.Account;

/**
 * Servlet implementation class LoginSerlvet
 */
@WebServlet({ "/LoginSerlvet", "/login" })
public class LoginSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSerlvet() {
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
		// get the data
	    String accountID = request.getParameter("username");
	    String password = request.getParameter("password");
	   
	    // set up an account object
	    Account account = new Account();
	    
	    // set up an AccountQuery object
	    AccountQuery aq = new AccountQuery ("retail","root","520hailaier");
	    aq.doLogin(accountID, password);
	    String url = "";
	    
	    //check the exsistence of the account
	    account = aq.getAccount();
	    String check = account.getAccountID();
	    if(check == null) {
	    	url = "/wrong.jsp";
	    }
	    else {
	    	url = "/membership.jsp";
	    }
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	    
	    
	
	}

}
