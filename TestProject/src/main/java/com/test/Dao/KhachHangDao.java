package com.test.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.test.entity.KhachHang;
import com.test.util.HibernateUtil;

public class KhachHangDao {
	public static List<KhachHang> layDanhSachKH(String tenkh) {
		List<KhachHang> lst = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		String sql = "FROM KhachHang ";
		if (tenkh.length() > 0) {
			sql += "WHERE HoVaTen LIKE '%" + tenkh + "%'";
		}
		Query query = session.createQuery(sql);
		lst = query.list();
		session.close();
		return lst;
	}

	public static KhachHang layThongTinKH(String makh) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		KhachHang kh = (KhachHang) session.get(KhachHang.class, makh);
		session.close();
		return kh;
	}

	public static boolean xoaKhachHang(String makh) {
		KhachHang kh = KhachHangDao.layThongTinKH(makh);
		if (kh == null)
			return false;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.getTransaction().begin();
			session.delete(kh);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
			session.close();
			return false;
		}
	}
}
