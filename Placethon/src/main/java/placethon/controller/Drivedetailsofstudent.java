package placethon.controller;

import java.io.IOException;
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
 * Servlet implementation class Drivedetailsofstudent
 */
@WebServlet("/Drivedetailsofstudent")
public class Drivedetailsofstudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Drivedetailsofstudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int stuid=Integer.parseInt(request.getParameter("stuid"));
		DrivesDAO drivesdao=new DrivesDAO();
		try 
		{
			 //drives=new ArrayList<DrivesPOJO>();
			//DrivesPOJO drive=new DrivesPOJO();
			 List<DrivesPOJO> drives=drivesdao.Showalldrivesofstudent(stuid);
			 if(drives!=null)
			 {
				 request.setAttribute("showdrivesStudent", drives);
				 request.setAttribute("result","Drives loaded");
			 }
			 else
			 {
				 request.setAttribute("result","You have not yet applied for drive"); 
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("showApplieddriveofstudent.jsp");
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
