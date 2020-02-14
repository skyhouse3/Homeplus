package com.kh.homeplus.facility.model.vo;

public class Counter {
	private int a;
	private int b;
	private int c;
	private int d;

	public Counter() {
		
	}

	public Counter(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Counter [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
	
	
}
