package com.test.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.test.entity.Address;
import com.test.entity.Employee;
import com.test.util.HibernateUtil;

public class EmpDao {

	public void insertAddress(Address address) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.getTransaction().begin();
			session.save(address);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
	}

	public Employee[] searchLikeName(String name) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "FROM Employee WHERE name LIKE ?";
			Query query = session.createQuery(sql);
			query.setString(0, "%" + name + "%");
			List lst = query.list();
			Employee[] result = new Employee[lst.size()];
			lst.toArray(result);
			session.getTransaction().commit();
			return result;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		return null;
	}

	public void deleteAddress(int addrID) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.getTransaction().begin();
			Address address = (Address) session.get(Address.class, addrID);
			session.delete(address);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
	}
	
	public void updateAddress(Address address) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.getTransaction().begin();
			session.update(address);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
	}
	
	public void insertEmp(Employee employee) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.getTransaction().begin();
			session.save(employee);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
	}

}
