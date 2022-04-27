package placethon.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import placethon.model.RecruiterDAO;
import placethon.model.RecruiterPOJO;


/**
 * Servlet implementation class Updaterecprofile
 */
@WebServlet("/Updaterecprofile")
public class Updaterecprofile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updaterecprofile() {
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
		int recid=Integer.parseInt(request.getParameter("recid"));
		String recfullname=request.getParameter("recfullname");
		String recmobile=request.getParameter("recmobile");
		String reccompname=request.getParameter("reccompname");
		String recemail=request.getParameter("recemail");
		RecruiterPOJO rec=new RecruiterPOJO();
		rec.setRecid(recid);
		rec.setRecfullname(recfullname);
		rec.setRecmobile(recmobile);
		rec.setReccompname(reccompname);
		rec.setRecemail(recemail);
		RecruiterDAO recruiterdao=new RecruiterDAO();
		try
		{
			count=recruiterdao.updaterec(rec);
			if(count>0)
			{
				request.setAttribute("updateresult","Update Successful");
			}
			else
			{
				request.setAttribute("updateresult","Cannot be updated. please try again");
			}
		}
		catch(ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
