package com.test.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Products {

	public List<Product> showProduct(String nameSearch) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
			String sql = "SELECT * FROM Products ";
			if (nameSearch.length() > 0) {
				sql += "WHERE Name LIKE '%" + nameSearch + "%'";
			}
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			List<Product> list = new ArrayList<Product>();
			while(rs.next()) {
				String code = rs.getString("Code");
				String name = rs.getString("Name");
				float price = rs.getFloat("Price");
				Product sp = new Product(code, name, price);
				list.add(sp);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
