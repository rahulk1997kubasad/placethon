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


import placethon.model.DrivesDAO;
import placethon.model.DrivesPOJO;

/**
 * Servlet implementation class ShowAllDrivesServlet
 */
@WebServlet("/ShowAllDrivesServlet")
public class ShowAllDrivesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllDrivesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		DrivesDAO drivesdao=new DrivesDAO();
		try 
		{
			 //drives=new ArrayList<DrivesPOJO>();
			//DrivesPOJO drive=new DrivesPOJO();
			 List<DrivesPOJO> drives=drivesdao.Showalldrives();
			if (drives!=null) 
			{
				request.setAttribute("drives", drives);
				request.setAttribute("result","Drives loaded");
	        } 
			else 
			{
				request.setAttribute("result","There are No drives right now");
	        }
			
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("applydrive.jsp");
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
