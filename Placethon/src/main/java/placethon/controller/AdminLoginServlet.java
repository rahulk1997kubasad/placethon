package placethon.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import placethon.model.AdminDAO;
import placethon.model.AdminPOJO;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AdminLoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	       String Adminloginemail=request.getParameter("Adminloginemail");
	       String Adminloginpassword=request.getParameter("Adminloginpassword");
	       
	       AdminPOJO adminpojo = new AdminPOJO();
	       adminpojo.setAdminemail(Adminloginemail);
	       adminpojo.setAdminpassword(Adminloginpassword);
	       AdminDAO admindao= new AdminDAO();
	       try {
				AdminPOJO count=admindao.AdminLogin(adminpojo);
				 if(count!=null) {
					 HttpSession session = request.getSession();
			            session.setAttribute("Adminlogin", count);
					 request.setAttribute("result","Login succeful");
		          		RequestDispatcher requestDispatcher=request.getRequestDispatcher("adminhome.jsp");
		          		requestDispatcher.forward(request,response);
				 }
				 else
			       {
			    	   request.setAttribute("result","Login unsucceful");
			    	   RequestDispatcher requestDispatcher=request.getRequestDispatcher("AdminLogin.jsp");
						requestDispatcher.forward(request,response);
			       }
			} 
	       catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	       
	    
	       
	}

}
