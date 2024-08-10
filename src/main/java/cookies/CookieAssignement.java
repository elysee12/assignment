package cookies;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieAssignement
 */
@WebServlet("/CookieAssignement")
public class CookieAssignement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieAssignement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String username = request.getParameter("username");
		Cookie[] cookie=request.getCookies();
		try {
		for(int i=0;i<cookie.length;i++) {
		username=(cookie[i].getName()+" is "+cookie[i].getValue());
		request.setAttribute("username", username);
        request.getRequestDispatcher("/index.jsp").forward(request,response);
		
		
		}}
		catch(NullPointerException e)
		{
			request.setAttribute("username", username);
	        request.getRequestDispatcher("/index.jsp").forward(request,response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 String username = request.getParameter("username");

	        Cookie cookie = new Cookie("username", username);
	        cookie.setMaxAge(60*60*24);
	        response.addCookie(cookie);
	        response.sendRedirect("CookieAssignement");
	}

}
