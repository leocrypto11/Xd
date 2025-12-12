package com.demo.beans;

import java.time.LocalDate;

public class Student {

	private String sname;
	private String password;
	private String stream;
	private LocalDate dob;
	private String Address;
		
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", password=" + password + ", stream=" + stream + ", dob=" + dob
				+ ", Address=" + Address + "]";
	}
	
	
	
}
