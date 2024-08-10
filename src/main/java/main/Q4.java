package main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Q4
 */
@WebServlet("/Q4")
public class Q4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
	        String userAgent = request.getHeader("User-Agent");
	        String host = request.getHeader("Host");
	        String acceptLanguage = request.getHeader("Accept-Language");

	        String htmlResponse = "<html><head><title>Header Information</title></head><body>"
	                + "<h1>Client Header Information</h1>"
	                + "<p><strong>User-Agent:</strong> " + userAgent + "</p>"
	                + "<p><strong>Host:</strong> " + host + "</p>"
	                + "<p><strong>Accept-Language:</strong> " + acceptLanguage + "</p>"
	                + "</body></html>";

	        response.getWriter().write(htmlResponse);
	    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
