package com.app.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UserController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
//		String action = request.getParameter("action");
//		 if (action.equalsIgnoreCase("addUser")) {
			request.getRequestDispatcher("addUser.jsp").forward(request, response);
		//} 
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		int eid = Integer.parseInt(request.getParameter("eid").trim());
//		String ename = request.getParameter("ename");
//		Double salary = Double.parseDouble(request.getParameter("salary"));
//		Employee employee = new Employee(ename, salary);
//		// new customer record
//		if (eid == 0) {
//			employeeService.addEmployee(employee);
//		} else {
//			employeeService.updateEmployee(eid, employee);
//		}
//
//		response.sendRedirect("empController.do?action=showall");// now we are following PRG dp
//		
		
//		RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
//		rd.forward(request, response);

	}

}
