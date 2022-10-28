package com.example.persistence.domain;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class Contract {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String length;
	
	private float monthlyprice;
	
	@OneToMany(mappedBy = "contract", fetch = FetchType.EAGER)
	@JsonIgnore
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Customer> customers = new ArrayList<>();

	public Contract(Long id, String length, float monthlyprice, List<Customer> customers) {
		super();
		this.id = id;
		this.length = length;
		this.monthlyprice = monthlyprice;
		this.customers = customers;
	}

	public Contract() {
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
		return "Contract [id=" + id + ", length=" + length + ", monthlyprice=" + monthlyprice + ", customers="
				+ customers + "]";
	}

	
}