package com.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "SACH")
@Entity
public class Sach {

	@Id
	@Column(name = "MaSach")
	private int maSach;
	
	@Column(name = "TenSach")
	private String tenSach;
	
	@Column(name = "Gia")
	private int gia;
	
	@Column(name = "MaTG")
	private int maTG;
	
	@Column(name = "SoLuong")
	private int soLuong;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "maTG")
	private TacGia tacGia;

	public Sach() {
		super();
	}

	public Sach(int maSach, String tenSach, int gia, int maTG, int soLuong) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.gia = gia;
		this.maTG = maTG;
		this.soLuong = soLuong;
	}
	
	public Sach(int maSach, String tenSach, int gia, int maTG, int soLuong, TacGia tacGia) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.gia = gia;
		this.maTG = maTG;
		this.soLuong = soLuong;
		this.tacGia = tacGia;
	}

	public int getMaSach() {
		return maSach;
	}

	public void setMaSach(int maSach) {
		this.maSach = maSach;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public int getMaTG() {
		return maTG;
	}

	public void setMaTG(int maTG) {
		this.maTG = maTG;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public TacGia getTacGia() {
		return tacGia;
	}

	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}
	
}
