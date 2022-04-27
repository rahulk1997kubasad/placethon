package placethon.controller;

import java.io.IOException;
import java.sql.SQLException;
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
 * Servlet implementation class Studetailspartidriveservlet
 */
@WebServlet("/Studetailspartidriveservlet")
public class Studetailspartidriveservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Studetailspartidriveservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int driveid=Integer.parseInt(request.getParameter("driveid"));	
		
		StudentDAO studentdao=new StudentDAO();
		
		try
		{
			List<StudentPOJO> students=studentdao.liststuofpartidrive(driveid);
			if(students!=null)
			{
				request.setAttribute("stulistofpardrive", students);
			}
			else
			{
				request.setAttribute("resultofstudrive","There are no students who applied for this drive");
			}
		}
		catch(ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("partstudetaildrive.jsp");
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
