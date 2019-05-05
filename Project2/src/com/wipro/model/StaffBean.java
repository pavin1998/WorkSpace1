package com.wipro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff_details")
public class StaffBean {
	@Id
	@Column(name = "staff_id")
	private String staff_id;
	@Column(name = "tutorname")
	private String tutorname;
	@Column(name = "classsection")
	private String classsection;
	@Column(name = "department")
	private String department;
	@Column(name = "dept_year")
	private int dept_year;
	@Column(name = "username")
	private String username;
	@Column(name = "passwd")
	private String passwd;
	@Column(name = "course")
	private String course;
	
	
	
	
	
	
	public String getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(String staff_id) {
		this.staff_id = staff_id;
	}
	public String getTutorname() {
		return tutorname;
	}
	public void setTutorname(String tutorname) {
		this.tutorname = tutorname;
	}
	public String getClasssection() {
		return classsection;
	}
	public void setClasssection(String classsection) {
		this.classsection = classsection;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getDept_year() {
		return dept_year;
	}
	public void setDept_year(int dept_year) {
		this.dept_year = dept_year;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}


}
