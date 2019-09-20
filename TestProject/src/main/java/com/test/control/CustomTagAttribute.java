package com.test.control;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTagAttribute extends SimpleTagSupport {
	private String ten;
	private String kieungay;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getKieungay() {
		return kieungay;
	}

	public void setKieungay(String kieungay) {
		this.kieungay = kieungay;
	}

	@Override
	public void doTag() throws JspException {
		JspWriter out = getJspContext().getOut();
		try {
			if (ten.isEmpty()) {
				ten = "Không tên";
			}
			if (kieungay.isEmpty()) {
				kieungay = "dd/MM/yyyy";
			}
			Date ngay = new Date();
			String chuoiNgay = new SimpleDateFormat(kieungay).format(ngay);
			out.println("<h2> Hôm nay ngày " + chuoiNgay + "</h2>");
			out.println("<h1> Chào mừng bạn " + ten + " đến đây </h1>");
		} catch (Exception e) {
			throw new JspException("Error in CustomTagAttribute tag " + e);
		}
	}
}
