package com.test.model;

import java.io.Serializable;

public class Lab4Bean implements Serializable{
	private double a;
	private double b;
	private double sum;
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
		sum += a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
		sum += b;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
}
