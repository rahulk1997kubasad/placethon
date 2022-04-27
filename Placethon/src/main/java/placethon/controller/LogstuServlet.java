package placethon.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import placethon.model.StudentDAO;
import placethon.model.StudentPOJO;

/**
 * Servlet implementation class LogstuServlet
 */
@WebServlet("/LogstuServlet")
public class LogstuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogstuServlet() {
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
		String stulogemail=request.getParameter("stulogemail");
		String stulogpassword=request.getParameter("stulogpassword");
		
		StudentDAO studentdao=new StudentDAO();
		try {
			StudentPOJO student=studentdao.logstudent(stulogemail,stulogpassword);
			if (student != null) {
	            HttpSession session = request.getSession();
	            session.setAttribute("stu", student);
				request.setAttribute("result","Login Successful");
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("stuhome.jsp");
				requestDispatcher.forward(request,response);

	        } else {
				request.setAttribute("result","Login Unsuccessful");
				RequestDispatcher requestDispatcher=request.getRequestDispatcher("stulog.jsp");
				requestDispatcher.forward(request,response);
	        }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
