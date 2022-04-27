package placethon.controller;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import placethon.model.ApplieddriveDAO;
import placethon.model.ApplieddrivePOJO;


/**
 * Servlet implementation class AddapplieddriveServlet
 */
@WebServlet("/AddapplieddriveServlet")
public class AddapplieddriveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddapplieddriveServlet() {
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
		int driveid=Integer.parseInt(request.getParameter("driveid"));
		int recid=Integer.parseInt(request.getParameter("recid"));
		int stuid=Integer.parseInt(request.getParameter("stuid"));
		ApplieddrivePOJO adrive=new ApplieddrivePOJO();
		adrive.setDriveid(driveid);
		adrive.setRecid(recid);
		adrive.setStuid(stuid);
		ApplieddriveDAO adrivedao=new ApplieddriveDAO();
		try {
			count=adrivedao.Addapplieddrive(adrive);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(count>0)
		{
			request.setAttribute("result1","Applied To drive successful");
		}
		else if(count==-1)
		{	
			request.setAttribute("result1","You have already applied for this drive");
		}
		else
		{
			request.setAttribute("result1","Unsuccessful. please try again");
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("Appliedstatus.jsp");
		requestDispatcher.forward(request,response);
	}

}
