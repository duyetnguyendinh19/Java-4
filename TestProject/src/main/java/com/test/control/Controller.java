package com.test.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.model.LoginBean;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	final private String errorPage = "fail.jsp";
	final private String homePage = "login.jsp";
	final private String welcomePage = "welcome.jsp";
	final private String registerPage = "register.jsp";
	final private String showPage = "showPage.jsp";
	
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String action = request.getParameter("btnAction");
			if(action.equals("Login")) {
				String username = request.getParameter("txtUsername");
				String password = request.getParameter("txtPass");
				LoginBean loginBean = new LoginBean();
				boolean result = loginBean.checkLogin(username, password);
				String url = errorPage;
				if(result) {
					HttpSession session = request.getSession(true);
					session.setAttribute("USER", username);
					url = welcomePage;
				}
				RequestDispatcher rd = request.getRequestDispatcher(url);
				rd.forward(request, response);
			}else if(action.equals("tryAgain")) {
				RequestDispatcher rd = request.getRequestDispatcher(homePage);
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
