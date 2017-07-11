package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NameController
 */
@WebServlet("/addName")
public class NameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NameController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter output = response.getWriter();
				
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		
		if(firstName == null && lastName == null) {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		else {
			request.setAttribute("firstName", firstName);
			request.setAttribute("lastName", lastName);
			getServletContext().getRequestDispatcher("/welcome.jsp").forward(request, response);
		}
		
		//Does Work
		//output.println("Welcome to the show " + firstName + " " + lastName + "!!!");
		
		//Does not work
		//output.println("Welcome to the show ${firstName} ${lastName}!!! :D");
	}

}
