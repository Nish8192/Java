package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletExample
 */
@WebServlet("/helloServlet")
public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter output = response.getWriter();
//		output.println("A Dynamic Web Application Servlet!!!");
		output.println("<html>");
		output.println("<title>Rendered from Servlet!!</title>");
		output.println("<body>");
		output.println("<h1 style='text-align:center'>THIS PAGE WAS RENDERED FROM A SERVLET (NO BUENO)</h1>");
		output.println("</body>");
		output.println("</html>");
	}

}
