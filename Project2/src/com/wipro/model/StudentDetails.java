package com.wipro.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stu_details")
public class StudentDetails {

	@Id
	@Column(name = "stu_id")
	private List<String> stu_id;
	@Column(name = "stu_name")
	private List<String> stu_name;
	@Column(name = "course")
	private List<String> course;
	@Column(name = "parent_name")
	private List<String> parent_name;
	@Column(name = "mobile_num")
	private List<Integer> mobile_num;
	@Column(name = "working_days")
	private List<Integer> working_days;
	@Column(name = "present_day")
	private List<Integer> present_day;
	@Column(name = "staff_id")
	private List<String> staff_id;
	@Column(name = "gender")
	private List<String> gender;
	public List<String> getStu_id() {
		return stu_id;
	}
	public void setStu_id(List<String> stu_id) {
		this.stu_id = stu_id;
	}
	public List<String> getStu_name() {
		return stu_name;
	}
	public void setStu_name(List<String> stu_name) {
		this.stu_name = stu_name;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public List<String> getParent_name() {
		return parent_name;
	}
	public void setParent_name(List<String> parent_name) {
		this.parent_name = parent_name;
	}
	public List<Integer> getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(List<Integer> mobile_num) {
		this.mobile_num = mobile_num;
	}
	public List<Integer> getWorking_days() {
		return working_days;
	}
	public void setWorking_days(List<Integer> working_days) {
		this.working_days = working_days;
	}
	public List<Integer> getPresent_day() {
		return present_day;
	}
	public void setPresent_day(List<Integer> present_day) {
		this.present_day = present_day;
	}
	public List<String> getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(List<String> staff_id) {
		this.staff_id = staff_id;
	}
	public List<String> getGender() {
		return gender;
	}
	public void setGender(List<String> gender) {
		this.gender = gender;
	}
	
}
