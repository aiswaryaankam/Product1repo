package com.slokam.Product1;

public class Product {
	public int pid;
	public String pname;
	public String pcolour;
	public double pprice;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcolour() {
		return pcolour;
	}
	public void setPcolour(String pcolour) {
		this.pcolour = pcolour;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcolour=" + pcolour + ", pprice=" + pprice + "]";
	}
	public Product(int pid, String pname, String pcolour, double pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcolour = pcolour;
		this.pprice = pprice;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

}
