package placethon.controller;

import java.io.IOException;
import java.sql.Date;
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
 * Servlet implementation class AddDriveServlet
 */
@WebServlet("/AddDriveServlet")
public class AddDriveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDriveServlet() {
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
		String drivedesc=request.getParameter("drivedesc");
		String drivelocation=request.getParameter("drivelocation");
		String drivestartdate=request.getParameter("drivestartdate");
		String driveenddate=request.getParameter("driveenddate");
		String criteria=request.getParameter("criteria");
		String CTC=request.getParameter("CTC");
		String experience=request.getParameter("experience");
		String jobtype=request.getParameter("jobtype");
		String driveprocess=request.getParameter("driveprocess");
		String companyname=request.getParameter("companyname");
		String jobResponsibilities=request.getParameter("jobResponsibilities");
		int recid=Integer.parseInt(request.getParameter("recid"));
		DrivesPOJO drive=new DrivesPOJO();
		drive.setDrivedesc(drivedesc);
		drive.setDrivelocation(drivelocation);
		Date date=Date.valueOf(drivestartdate);
		java.sql.Date d1= new java.sql.Date(date.getTime());
		drive.setDrivestartdate(d1);
		Date date1=Date.valueOf(driveenddate);
		java.sql.Date d2= new java.sql.Date(date1.getTime());
		drive.setDriveenddate(d2);
		drive.setCriteria(criteria);
		drive.setCTC(CTC);
		drive.setExperience(experience);
		drive.setJobtype(jobtype);
		drive.setDriveprocess(driveprocess);
		drive.setCompanyname(companyname);
		drive.setJobResponsibilities(jobResponsibilities);
		drive.setRecid(recid);
		DrivesDAO drivesdao=new DrivesDAO();
		try {
			count=drivesdao.Adddrive(drive);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(count>0)
		{
			request.setAttribute("result","Drive Added");
		}
		else
		{
			request.setAttribute("result","Drive cannot be added. please try again");
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("adddrive.jsp");
		requestDispatcher.forward(request,response);
	}

}
