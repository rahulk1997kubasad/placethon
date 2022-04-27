package placethon.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import placethon.model.RecruiterDAO;
import placethon.model.RecruiterPOJO;


/**
 * Servlet implementation class Regrecservlet
 */
@WebServlet("/Regrecservlet")
public class Regrecservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Regrecservlet() {
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
		int count=0;
		String recregemail=request.getParameter("recregemail");
		String recregfullname=request.getParameter("recregfullname");
		String recregcompname=request.getParameter("recregcompname");
		String gender=request.getParameter("gender");
		String recregmobile=request.getParameter("recregmobile");
		String recregpassword=request.getParameter("recregpassword");
		RecruiterPOJO recruiter=new RecruiterPOJO();
		recruiter.setRecemail(recregemail);
		recruiter.setRecfullname(recregfullname);
		recruiter.setReccompname(recregcompname);
		recruiter.setGender(gender);
		recruiter.setRecmobile(recregmobile);
		try {
			recruiter.setRecpassword(recregpassword);
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		RecruiterDAO recruiterdao=new RecruiterDAO();
		try {
			count=recruiterdao.regrecruiter(recruiter);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(count>0)
		{
			request.setAttribute("result","Recruiter is registered");
		}
		else if(count==-1)
		{
			request.setAttribute("result","Recruiter email already exists");
		}
		else
		{
			request.setAttribute("result","Recruiter cannot be registered. please try again");
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("recreg.jsp");
		requestDispatcher.forward(request,response);
	}

}
