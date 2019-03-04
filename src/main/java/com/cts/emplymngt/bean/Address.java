package com.cts.emplymngt.bean;

public class Address {
	
	private String house_no;
	
	private String landmark;
	private int pincode;
	private String st_no;
	public Address(String house_no, String landmark, int pincode, String st_no) {
		super();
		this.house_no = house_no;
		this.landmark = landmark;
		this.pincode = pincode;
		this.st_no = st_no;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getSt_no() {
		return st_no;
	}
	public void setSt_no(String st_no) {
		this.st_no = st_no;
	}
	
	

}
