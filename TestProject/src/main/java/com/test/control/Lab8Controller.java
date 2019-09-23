package com.test.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.Dao.EmpDao;
import com.test.entity.Address;
import com.test.entity.Employee;

/**
 * Servlet implementation class Lab8Controller
 */
public class Lab8Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Lab8Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String action = request.getParameter("action");
			if (action.equals("Insert")) {
				String userID = request.getParameter("txtUserID");
				String username = request.getParameter("txtUsername");
				String id1 = request.getParameter("txtID1");
				String addr1 = request.getParameter("txtAddrName1");
				String phone1 = request.getParameter("txtPhone1");
				String id2 = request.getParameter("txtID2");
				String addr2 = request.getParameter("txtAddrName2");
				String phone2 = request.getParameter("txtPhone2");
				int nUserID = Integer.parseInt(userID);
				int nID1 = Integer.parseInt(id1);
				int nID2 = Integer.parseInt(id2);
				EmpDao empDao = new EmpDao();
				empDao.insertEmp(new Employee(nUserID, username));
				empDao.insertAddress(new Address(nID1, addr1, phone1, nUserID));
				empDao.insertAddress(new Address(nID2, addr2, phone2, nUserID));
				out.println("Insert is Ok!!!");
			} else if (action.equals("Search")) {
				String username = request.getParameter("txtUsername");
				EmpDao empDao = new EmpDao();
				Employee[] result = empDao.searchLikeName(username);
				request.setAttribute("INFO", result);
				RequestDispatcher rd = request.getRequestDispatcher("lab8_show3.jsp");
				rd.forward(request, response);
			} else if (action.equals("Update")) {
				String userID = request.getParameter("txtUserID");
				String id1 = request.getParameter("txtID1");
				String addr1 = request.getParameter("txtAddrName1");
				String phone1 = request.getParameter("txtPhone1");
				String username = request.getParameter("txtSearch");
				int nID1 = Integer.parseInt(id1);
				int nUserID = Integer.parseInt(userID);
				EmpDao empDao = new EmpDao();
				empDao.updateAddress(new Address(nID1, addr1, phone1, nUserID));
				String url = "Lab8Controller?action=Search&txtUsername="; //+ username;
				RequestDispatcher rd = request.getRequestDispatcher(url);
				rd.forward(request, response);
			} else if (action.equals("Delete")) {
				String id1 = request.getParameter("txtID1");
				String username = request.getParameter("txtSearch");
				int nID1 = Integer.parseInt(id1);
				EmpDao empDao = new EmpDao();
				empDao.deleteAddress(nID1);
				String url = "Lab8Controller?action=Search&txtUsername=" + username;
				RequestDispatcher rd = request.getRequestDispatcher(url);
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
