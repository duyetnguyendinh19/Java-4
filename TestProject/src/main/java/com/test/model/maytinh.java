package com.test.model;

import java.io.Serializable;

public class maytinh implements Serializable{

	public maytinh() {
	}

	public double cong(double a, double b) {
		return a+b;
	}
	
	public double tru(double a, double b) {
		return a-b;
	}
	
	public double nhan(double a, double b) {
		return a*b;
	}
	
	public double chia(double a, double b) {
		return a/b;
	}
}
