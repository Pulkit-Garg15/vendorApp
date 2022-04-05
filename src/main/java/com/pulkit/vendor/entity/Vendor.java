package com.pulkit.vendor.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {

	@Id
	private int id;
	
	private String code;
	private String name;
	private String type;
	private String email;
	private String phone;
	private String address;
	
	public Vendor() {
		super();
	}

	public Vendor(int id, String code, String name, String type, String email, String phone, String address) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.type = type;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	public Vendor(String code, String name, String type, String email, String phone, String address) {
		super();
		this.code = code;
		this.name = name;
		this.type = type;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + "]";
	}

}
