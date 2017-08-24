package br.edu.unicesumar.servlets;

import br.edu.unicesumar.Model.Customer;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import br.edu.unicesumar.service.CustomerService;

/**
 * Servlet implementation class listCustomerServlet
 */
@WebServlet("/listCustomerServlet")
public class listCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerService service = new CustomerService();
		ArrayList<Customer> lista =  (ArrayList<Customer>) service.listAll();
		request.setAttribute("listCustomer", lista);
		
		//Redirecionar
	    RequestDispatcher rd = getServletContext().getRequestDispatcher("/listCustomer.jsp");
	    rd.forward(request, response);
	}

	
}
