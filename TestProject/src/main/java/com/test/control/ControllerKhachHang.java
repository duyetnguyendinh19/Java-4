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
	
	String makhBefore = "";
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			String action = request.getParameter("action");
			if (action.equals("Search")) {
				String tenkh = request.getParameter("txtTenKH");
				List<KhachHang> lstKH = KhachHangDao.layDanhSachKH(tenkh);
				request.setAttribute("listKH", lstKH);
				String url = "lab7KhachHang.jsp";
				RequestDispatcher rd = request.getRequestDispatcher(url);
				rd.forward(request, response);
			} else if (action.equals("Delete")) {
				String makh = request.getParameter("txtMaKH");
				boolean daxoa = KhachHangDao.xoaKhachHang(makh);
				if (daxoa) {
					String url = "ControllerKhachHang?txtTenKH=&action=Search";
					RequestDispatcher rd = request.getRequestDispatcher(url);
					rd.forward(request, response);
				}
			} else if (action.equals("Insert") || action.equals("Update")) {
				KhachHang kh = new KhachHang();
				makhBefore = request.getParameter("txtMaKH");
				if (makhBefore != null && !makhBefore.isEmpty()) {
					kh = KhachHangDao.layThongTinKH(makhBefore);
				}
				request.setAttribute("kh", kh);
				RequestDispatcher rd = request.getRequestDispatcher("lab7KhachHangChange.jsp");
				rd.forward(request, response);
			} else if (action.equals("Save")) {
				String makh = request.getParameter("txtMaKH");
				String hoten = request.getParameter("txtHoTen");
				String matkhau = request.getParameter("txtPass");
				String email = request.getParameter("txtEmail");
				String soDT = request.getParameter("txtSDT");
				KhachHang kh = new KhachHang(makh, matkhau, hoten, email, soDT);
				if (makhBefore != null && !makhBefore.isEmpty()) {
					KhachHangDao.updateKH(kh);
				} else {
					KhachHangDao.insertKH(kh);
				}
				String url = "ControllerKhachHang?txtTenKH=&action=Search";
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
