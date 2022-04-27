package placethon.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import placethon.model.StudentDAO;
import placethon.model.StudentPOJO;

/**
 * Servlet implementation class Editstubyadminservlet
 */
@WebServlet("/Editstubyadminservlet")
public class Editstubyadminservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Editstubyadminservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//StudentPOJO student=new StudentPOJO();
		StudentDAO studentdao=new StudentDAO();
		try
		{
			List<StudentPOJO> studentdetail=studentdao.Editstubyadmin();
			if(studentdetail!=null)
			{
				request.setAttribute("studentdetailstoadmin", studentdetail);
			}
			else
			{
				request.setAttribute("resultofstudetails", "No students is available");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("Editstudentbyadmin.jsp");
		requestDispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
