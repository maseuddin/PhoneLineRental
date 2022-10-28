package com.example.rest.dto;

import com.example.persistence.domain.Contract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class CustomerDTO {

	private String name;
	
	private Long phone;
	
	private String address;
	
	private String email;
	
	private String username;
	
	private String password;

	public CustomerDTO(String name, Long phone, String address, String email, String username, String password) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public CustomerDTO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "CustomerDTO [name=" + name + ", phone=" + phone + ", address=" + address + ", email=" + email
				+ ", username=" + username + ", password=" + password + "]";
	}

	
}