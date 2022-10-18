package com.student.manage;

public class student {
	
	private int sid;
	private String sname;
	private String scity;
	private String sphone;
	
	public student() {
		super();
		
	}

	public student(String sname, String scity, String sphone) {
		super();
		this.sname = sname;
		this.scity = scity;
		this.sphone = sphone;
	}

	public student(int sid, String sname, String scity, String sphone) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		this.sphone = sphone;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", sphone=" + sphone + "]";
	}
	
	

}
