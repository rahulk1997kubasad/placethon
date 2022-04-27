package placethon.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import placethon.model.StudentDAO;
import placethon.model.StudentPOJO;

/**
 * Servlet implementation class Addstufromadminservlet
 */
@WebServlet("/Addstufromadminservlet")
public class Addstufromadminservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addstufromadminservlet() {
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
		String sturegemail=request.getParameter("sturegemail");
		String sturegfullname=request.getParameter("sturegfullname");
		String sturegmobile=request.getParameter("sturegmobile");
		String gender=request.getParameter("gender");
		String sturegpassword=request.getParameter("sturegpassword");
		StudentPOJO student=new StudentPOJO();
		student.setStuemail(sturegemail);
		student.setStufullname(sturegfullname);
		student.setStumobile(sturegmobile);
		student.setStugender(gender);
		try {
			student.setStupassword(sturegpassword);
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		StudentDAO studentdao=new StudentDAO();
		try {
			count=studentdao.regstudent(student);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(count>0)
		{
			request.setAttribute("result","Candidate is registered");
		}
		else if(count==-1)
		{
			request.setAttribute("result","Candidate email already exists");
		}
		else
		{
			request.setAttribute("result","Candidate cannot be registered. please try again");
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("Addstufromadmin.jsp");
		requestDispatcher.forward(request,response);
	}

}
