package com.heyx.test.entity;

/**
 * jpa注解
 */
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

//@Entity(name = "tb_student")
@Entity
@Table(name = "tb_student",schema = "hibernate")
public class Student implements Serializable {

	@Id
	private int sid;

	@Id
	@Column(length = 8)
	private String sname;

	private String gender;

	private Date birthday;

	private String major;

	private Address address;

	public Student(){

	}

	public Student(int sid, String sname, String gender, Date birthday, String major, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.gender = gender;
		this.birthday = birthday;
		this.major = major;
		this.address = address;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
