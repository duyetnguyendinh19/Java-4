package com.test.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.model.maytinh;

/**
 * Servlet implementation class MayTinhController
 */
public class MayTinhController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MayTinhController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String action = request.getParameter("action");
			String a = request.getParameter("txtSo1");
			String b = request.getParameter("txtSo2");
			double so1 = Double.parseDouble(a);
			double so2 = Double.parseDouble(b);
			if(action.equals("+")) {
				maytinh maytinh = new maytinh();
				out.write(so1 +" + "+ so2 + " = " + maytinh.cong(so1, so2) );
			}else if(action.equals("-")) {
				maytinh maytinh = new maytinh();
				out.write(so1 +" - "+ so2 + " = " + maytinh.tru(so1, so2) );
			}else if(action.equals("*")) {
				maytinh maytinh = new maytinh();
				out.write(so1 +" * "+ so2 + " = " + maytinh.nhan(so1, so2) );
			}else {
				maytinh maytinh = new maytinh();
				out.write(so1 +" / "+ so2 + " = " + maytinh.chia(so1, so2) );
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
