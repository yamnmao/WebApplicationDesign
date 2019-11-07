package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddQuery;
import model.Account;

/**
 * Servlet implementation class RegisterSerlvet
 */
@WebServlet({ "/RegisterSerlvet", "/register" })
public class RegisterSerlvet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterSerlvet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accountID = request.getParameter("username");
		String pwd  = request.getParameter("password");
		String lastname = request.getParameter("lastname");
		String middlename = request.getParameter("middlename");
		String firstname = request.getParameter("firstname");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		int zipcode = Integer.parseInt(request.getParameter("zipcode"));
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		Account account = new Account();
		account.setAccountID(accountID);
		account.setPassword(pwd);
		account.setLastName(lastname);
		account.setMiddleName(middlename);
		account.setFirstName(firstname);
		account.setStreetAddress(address);
		account.setCity(city);
		account.setState(state);
		account.setZipcode(zipcode);
		account.setEmail(email);
		account.setPhone(phone);
		
		
		AddQuery aq = new AddQuery ("retail","root","520hailaier");
		aq.doAdd(account);
		String url = "/membership.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
