package com.test.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.Dao.KhachHangDao;
import com.test.entity.KhachHang;

/**
 * Servlet implementation class ControllerKhachHang
 */
public class ControllerKhachHang extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerKhachHang() {
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
		try {
			String action = request.getParameter("action");
			if(action.equals("Search")) {
				String tenkh = request.getParameter("txtTenKH");
				List<KhachHang> lstKH = KhachHangDao.layDanhSachKH(tenkh);
				request.setAttribute("listKH", lstKH );
				String url = "lab7KhachHang.jsp";
				RequestDispatcher rd = request.getRequestDispatcher(url);
				rd.forward(request, response);
			}else if(action.equals("Delete")) {
				String makh = request.getParameter("txtMaKH");
				boolean daxoa = KhachHangDao.xoaKhachHang(makh);
				if(daxoa) {
					String url = "ControllerKhachHang?txtTenKH=&action=Search";
					RequestDispatcher rd = request.getRequestDispatcher(url);
					rd.forward(request, response);
				}
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
