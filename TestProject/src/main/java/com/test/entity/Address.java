package com.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblEmpAddr")
public class Address {

	@Id
	@Column(name = "addr_ID")
	private int addrID;

	@Column(name = "addrName")
	private String addrName;

	@Column(name = "phoneNo")
	private String phoneNo;

	@Column(name = "user_ID")
	private int userID;

	public Address() {
		super();
	}

	public Address(int addrID, String addrName, String phoneNo, int userID) {
		super();
		this.addrID = addrID;
		this.addrName = addrName;
		this.phoneNo = phoneNo;
		this.userID = userID;
	}

	public int getAddrID() {
		return addrID;
	}

	public void setAddrID(int addrID) {
		this.addrID = addrID;
	}

	public String getAddrName() {
		return addrName;
	}

	public void setAddrName(String addrName) {
		this.addrName = addrName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	
}
