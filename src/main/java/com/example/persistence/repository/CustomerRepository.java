package com.example.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.persistence.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
//	@Query("select cust from customer cust where cust.name=?1")
//	Optional<List<Customer>> customerByname(String name);
}
	