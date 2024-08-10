package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q1")
public class Q1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Q1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 double a = Double.parseDouble(request.getParameter("a"));
	        double b = Double.parseDouble(request.getParameter("b"));
	        double c = Double.parseDouble(request.getParameter("c"));

	        double discriminant = b * b - 4 * a * c;
	        String roots;

	        if (discriminant > 0) {
	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            roots = "Roots are real and different: " + root1 + " and " + root2;
	        } else if (discriminant == 0) {
	            double root = -b / (2 * a);
	            roots = "Roots are real and the same: " + root;
	        } else {
	            roots = "Roots are complex and different.";
	        }

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html><body>");
	        out.println("<h1>Result</h1>");
	        out.println("<p>" + roots + "</p>");
	        out.println("<a href='Q1.html'>Back</a>");
	        out.println("</body></html>");
	    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
