package com.test.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tblEmp")
public class Employee {

	@Id
	@Column(name = "userID")
	private int userID;
	
	@Column(name = "Name")
	private String name;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_ID")
	private List<Address> lstAddress;

	public Employee() {
		super();
	}

	public Employee(int userID, String name) {
		super();
		this.userID = userID;
		this.name = name;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getLstAddress() {
		return lstAddress;
	}

	public void setLstAddress(List<Address> lstAddress) {
		this.lstAddress = lstAddress;
	}
	
}
