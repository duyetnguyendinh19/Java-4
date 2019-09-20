package com.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "KHACHHANG")
@Entity
public class KhachHang {
	
	@Id
	@Column(name = "MaKhachHang")
	private String MaKhachHang;
	@Column(name = "MatKhau")
	private String MatKhau;
	@Column(name = "HoVaTen")
	private String HoVaTen;
	@Column(name = "Email")
	private String Email;
	@Column(name = "DienThoai")
	private String SoDienThoai;
	
	public KhachHang() {
		super();
	}
	
	public KhachHang(String maKhachHang, String matKhau, String hoVaTen, String email, String soDienThoai) {
		super();
		MaKhachHang = maKhachHang;
		MatKhau = matKhau;
		HoVaTen = hoVaTen;
		Email = email;
		SoDienThoai = soDienThoai;
	}
	
	public String getMaKhachHang() {
		return MaKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		MaKhachHang = maKhachHang;
	}
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}
	public String getHoVaTen() {
		return HoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		HoVaTen = hoVaTen;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSoDienThoai() {
		return SoDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		SoDienThoai = soDienThoai;
	}
	
	
}
