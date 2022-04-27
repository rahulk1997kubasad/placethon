package placethon.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import placethon.model.StudentDAO;
import placethon.model.StudentPOJO;

/**
 * Servlet implementation class EditsinglestubyadminServlet
 */
@WebServlet("/EditsinglestubyadminServlet")
public class EditsinglestubyadminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditsinglestubyadminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		int stuid=Integer.parseInt(request.getParameter("stuid"));
		StudentPOJO studentpojo=new StudentPOJO();
		StudentDAO studentdao=new StudentDAO();
		try
		{
			studentpojo=studentdao.showsinglestutoadmin(stuid);
			if(studentpojo!=null)
			{
				request.setAttribute("showsinglestutoadmin", studentpojo);
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("Showsinglestutoadmin.jsp");
				requestDispatcher.forward(request,response);
			}
			else
			{
				request.setAttribute("resultofstutoadmin", "Student is not available");
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("Showsinglestutoadmin.jsp");
				requestDispatcher.forward(request,response);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
