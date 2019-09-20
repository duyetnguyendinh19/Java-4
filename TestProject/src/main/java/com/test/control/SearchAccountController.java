package com.test.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchAccountController
 */
public class SearchAccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchAccountController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>SearchAccount</title></head>");
		out.println("<body><h1>Kết quả tra điện thoại theo yêu cầu của bạn: </h1>");
		out.println("<table border=1 cellPadding=1 cellSpacing=1>");
		String ten = request.getParameter("txtThueBao");

		String newSQL = "SELECT * FROM customer ";
		if (ten != null && !ten.isEmpty()) {
			newSQL += "WHERE TenThueBao like '%" + ten + "%'";
		}

		Statement stmt = null;
		ResultSet rs = null;

		try {
			Connection cn = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
			stmt = cn.createStatement();
			rs = stmt.executeQuery(newSQL);
			out.println("<tr><th>Số thứ tự</th><th>Tên thuê bao</th><th>Số điện thoại</th><th>Địa chỉ</th></tr>\n");
			if (rs != null) {
				for (int i = 1; rs.next(); i++) {
					out.println("<tr><td>" + i + "</td><td>" + rs.getString(2) + "</td>" + "<td>" + rs.getString(3)
							+ "</td>" + "<td>" + rs.getString(4) + "</td>" + "</tr>\n");
				}
			}

			out.println("</table></body></html>");
			rs.close();
			stmt.close();
			cn.close();
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
