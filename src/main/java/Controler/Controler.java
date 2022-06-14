package Controler;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Students;
import Model.myModelStudentDetailsDbUtil;

@WebServlet("/Controler") 
public class Controler extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 What actualy do Controler
		// Get data from database(Model)
		
		try {
		List<Students> student =	myModelStudentDetailsDbUtil.getStudents();
		request.setAttribute("student", student);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		// redireact to the view(jsp page) 
		RequestDispatcher rd = request.getRequestDispatcher("myView.jsp");
		rd.forward(request, response);        
	}

}
