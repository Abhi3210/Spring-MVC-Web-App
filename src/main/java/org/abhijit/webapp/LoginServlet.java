package org.abhijit.webapp;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	
@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserValidationService service=new UserValidationService();
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException
	{
		/*PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> yahoo !!!!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("My First Servlet");
		out.println("</body>");
		out.println("</html>");*/
		//String name=request.getParameter("name");
		/*request.setAttribute("name",request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));*/
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException
	{
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	boolean isUserValid=service.isUserValid(name,password);
	if(isUserValid)
	{
	request.setAttribute("name",name);
	request.setAttribute("password", password);
	request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
	}
	else
	{   
		request.setAttribute("errormessage", "Invalid Credentials !!!");
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	}

}
