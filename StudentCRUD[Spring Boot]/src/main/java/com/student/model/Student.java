package com.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="student_info")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stu_id")
	private int stuId;
	
	@NotNull
	@Column(name="stu_name")
	private String stuName;
	

	@Column(name="stu_rollno")
	private int stuRollNo;
	
	@Column(name="stu_age")
	private int stuAge;


	

	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuRollNo() {
		return stuRollNo;
	}
	public void setStu_RollNo(int stu_RollNo) {
		this.stuRollNo = stu_RollNo;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stu_RollNo=" + stuRollNo + ", stuAge=" + stuAge
				;
	}

	
	
}
