package com.example.SubjectRestService.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {
	@Id
	private int sid;
	private String subname;
	private String duration;
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private LocalDate startdate;
	private int marks;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int sid, String subname, String duration, LocalDate startdate, int marks) {
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

	public LocalDate getStartdate() {
		return startdate;
	}

	public void setStartdate(LocalDate startdate) {
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
		return "Subject [sid=" + sid + ", subname=" + subname + ", duration=" + duration + ", startdate=" + startdate
				+ ", marks=" + marks + "]";
	}

	
	
	
}
