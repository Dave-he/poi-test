package com.heyx.test.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 * 地址
 *
 * @Embeddable 表示一个嵌入类，这个类的对象在另一个实体类中充当属性
 */

@Embeddable
public class Address {

	private String postCode;

	private String address;

	private String phone;

	public Address(){

	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
