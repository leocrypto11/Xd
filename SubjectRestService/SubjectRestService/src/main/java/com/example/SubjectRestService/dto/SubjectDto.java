package com.example.SubjectRestService.dto;

public class SubjectDto {

	private int sid;
	private String subname;
	private String duration;
	private String startdate;
	private int marks;
	
	public SubjectDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubjectDto(int sid, String subname, String duration, String startdate, int marks) {
		super();
		this.sid = sid;
		this.subname = subname;
		this.duration = duration;
		this.startdate = startdate;
		this.marks = marks;
	}

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

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "SubjectDto [sid=" + sid + ", subname=" + subname + ", duration=" + duration + ", startdate=" + startdate
				+ ", marks=" + marks + "]";
	}
	
	
}
