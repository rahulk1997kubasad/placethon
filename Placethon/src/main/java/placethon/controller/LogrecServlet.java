package placethon.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import placethon.model.RecruiterDAO;
import placethon.model.RecruiterPOJO;



/**
 * Servlet implementation class LogrecServlet
 */
@WebServlet("/LogrecServlet")
public class LogrecServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogrecServlet() {
        super();
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
		// TODO Auto-generated method stub

		String reclogemail=request.getParameter("reclogemail");
		String reclogpassword=request.getParameter("reclogpassword");
		
		RecruiterDAO recruiterdao=new RecruiterDAO();
		try {
			RecruiterPOJO recruiter=recruiterdao.logrecruiter(reclogemail,reclogpassword);
			if (recruiter != null) {
	            HttpSession session = request.getSession();
	            session.setAttribute("rec", recruiter);
				request.setAttribute("result","Login Successful");
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("rechome.jsp");
				requestDispatcher.forward(request,response);
	        } 
			else 
			{
				request.setAttribute("result","Login Unsuccessful");
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("reclog.jsp");
				requestDispatcher.forward(request,response);
	        }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
