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
 * Servlet implementation class Drivedetailsofrecruiter
 */
@WebServlet("/Drivedetailsofrecruiter")
public class Drivedetailsofrecruiter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Drivedetailsofrecruiter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int recid=Integer.parseInt(request.getParameter("recid"));
		DrivesDAO drivesdao=new DrivesDAO();
		try 
		{
			 //drives=new ArrayList<DrivesPOJO>();
			//DrivesPOJO drive=new DrivesPOJO();
			List<DrivesPOJO> drives=drivesdao.ShowalldrivesofRecruiter(recid);
			if (drives!=null) 
			{
				request.setAttribute("singledriveofrecruiter", drives);
	        } 
			else 
			{
				request.setAttribute("result123","There are No drives right now");
				
	        }
			
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("Drivedetailsofrec.jsp");
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
