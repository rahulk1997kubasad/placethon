package placethon.controller;

import java.io.IOException;
import java.sql.SQLException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import placethon.model.DrivesDAO;
import placethon.model.DrivesPOJO;

/**
 * Servlet implementation class Showsingledriveservlet
 */
@WebServlet("/Showsingledriveservlet")
public class Showsingledriveservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Showsingledriveservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int driveid=Integer.parseInt(request.getParameter("driveid"));
		DrivesDAO drivesdao=new DrivesDAO();
		try 
		{
			 //drives=new ArrayList<DrivesPOJO>();
			//DrivesPOJO drive=new DrivesPOJO();
			DrivesPOJO drives=drivesdao.Showsingledrive(driveid);
			if (drives!=null) 
			{
				request.setAttribute("singledrive", drives);
				request.setAttribute("result","Drive loaded");
	        } 
			else 
			{
				request.setAttribute("result","There are No drives right now");
	        }
			
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("Showsingledrive.jsp");
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
