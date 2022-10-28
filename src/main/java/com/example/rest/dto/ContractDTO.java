package com.example.rest.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.persistence.domain.Contract;
import com.example.persistence.domain.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class ContractDTO {
	
    private Long id;

    private String length;
    
    private float monthlyprice;

    private List<Customer> customers  = new ArrayList<>();

	public ContractDTO(Long id, String length, float monthlyprice, List<Customer> customers) {
		super();
		this.id = id;
		this.length = length;
		this.monthlyprice = monthlyprice;
		this.customers = customers;
	}

	public ContractDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public float getMonthlyprice() {
		return monthlyprice;
	}

	public void setMonthlyprice(float monthlyprice) {
		this.monthlyprice = monthlyprice;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "ContractDTO [id=" + id + ", length=" + length + ", monthlyprice=" + monthlyprice + ", customers="
				+ customers + "]";
	}

    
}