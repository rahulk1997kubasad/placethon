package placethon.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import placethon.model.StudentDAO;
import placethon.model.StudentPOJO;

/**
 * Servlet implementation class Showstudprofileservlet
 */
@WebServlet("/Showstudprofileservlet")
public class Showstudprofileservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Showstudprofileservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int count=0;
		int stuid=Integer.parseInt(request.getParameter("stuid"));
		String stufullname=request.getParameter("stufullname");
		String stuemail=request.getParameter("stuemail");
		String stumobile=request.getParameter("stumobile");
		String linkforresume=request.getParameter("stulinktodrive");
		StudentPOJO student=new StudentPOJO();
		student.setStuid(stuid);
		student.setStuemail(stuemail);
		student.setStufullname(stufullname);
		student.setStumobile(stumobile);
		student.setLinkforresume(linkforresume);
		StudentDAO studentdao=new StudentDAO();
		try 
		{
			count=studentdao.showprofileofstudent(student);
			if(count>0)
			{
				request.setAttribute("updateresult","Update Successful");
			}
			else
			{
				request.setAttribute("updateresult","Cannot be updated. please try again");
			}
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("showstudentProfile.jsp");
		requestDispatcher.forward(request,response);
	}

}
