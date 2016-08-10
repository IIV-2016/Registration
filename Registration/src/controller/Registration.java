package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.RegistrationDAO;
import model.domain.RegistrationBean;

@SuppressWarnings("serial")
public class Registration extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		process(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("euc-kr");
		String command = request.getParameter("command");
		
		if(command == null){
			command = "list";
		}		
		
		if(command.equals("list")){
			RegistrationBean [] registrationList = RegistrationDAO.readRegistrationList();	
			request.setAttribute("registrationList", registrationList);
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
			
			return;
		}else if(command.equals("attendance")){
			RegistrationBean [] registrationList = RegistrationDAO.readRegistrationList();	
			request.setAttribute("registrationList", registrationList);
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
			
			return;
		}
	}
}