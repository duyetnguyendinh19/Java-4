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
@Table(name = "TACGIA")
public class TacGia {

	@Id
	@Column(name = "MaTG")
	private int MaTG;
	
	@Column(name = "TenTacGia")
	private String tenTG;
	
	@Column(name = "DiaChi")
	private String diaChi;
	
	public TacGia() {
		super();
	}

	public TacGia(int maTG, String tenTG, String diaChi) {
		super();
		MaTG = maTG;
		this.tenTG = tenTG;
		this.diaChi = diaChi;
	}

	public int getMaTG() {
		return MaTG;
	}

	public void setMaTG(int maTG) {
		MaTG = maTG;
	}

	public String getTenTG() {
		return tenTG;
	}

	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
}
