package com.test.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.test.entity.Sach;
import com.test.entity.TacGia;
import com.test.util.HibernateUtil;

/**
 * Servlet implementation class Lab8Controller1
 */
public class Lab8Controller1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab8Controller1() {
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
			String action = request.getParameter("action");
			if(action.equals("Search")) {
				Session session = HibernateUtil.getSessionFactory().getCurrentSession();
				String txtSearch = request.getParameter("txtSearch");
				try {
					session.beginTransaction();
					String hql = "FROM Sach s ";
					if(txtSearch.length() > 0) {
						hql += "WHERE s.tenSach LIKE '%"+txtSearch+"%'";
					}
					List<Sach> lst = session.createQuery(hql).list();
					request.setAttribute("lst", lst);
					session.close();
					RequestDispatcher rd = request.getRequestDispatcher("lab8b2.jsp");
					rd.forward(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
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
