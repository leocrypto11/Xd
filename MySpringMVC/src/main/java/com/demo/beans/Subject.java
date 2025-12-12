package com.demo.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Subject {
	private int sid;
	private String subname;
	private String duration;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate startdate;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSubname() {
		return subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
		this.startdate = startdate;
	}

	@Override
	public String toString() {
		return "Subject [sid=" + sid + ", subname=" + subname + ", duration=" + duration + ", startdate=" + startdate + "]";
	}

}
