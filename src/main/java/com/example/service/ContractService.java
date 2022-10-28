package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.ContractNotFoundException;
import com.example.persistence.domain.Contract;
import com.example.persistence.repository.ContractRepository;
import com.example.rest.dto.ContractDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ContractService {
@Autowired
	private ContractRepository repo;
@Autowired
	private ModelMapper mapper;
	
	private ContractDTO mapToDTO(Contract contract) {
		return this.mapper.map(contract, ContractDTO.class);
	}
	
	public ContractDTO addContract(Contract contract) {
		Contract saved = this.repo.save(contract);
		return this.mapToDTO(saved);
	}
	
	public List<ContractDTO> getAllContracts() {
		
		return this.repo.findAll().stream().map(this::mapToDTO).collect(Collectors.toList());
	}
	
	public ContractDTO updateContract(Long id, Contract contract) {
		Optional<Contract> tempContract = Optional.of(this.repo.findById(id).orElseThrow(ContractNotFoundException::new));
		
		Contract existing = tempContract.get();
		existing.setLength(contract.getLength());
		existing.setMonthlyprice(contract.getMonthlyprice());
		existing.setCustomers(contract.getCustomers());
		
		Contract updated = this.repo.save(existing);
		return this.mapToDTO(updated);
	}
	
	public boolean deleteContract(Long id) {
		this.repo.findById(id).orElseThrow(ContractNotFoundException::new);
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	}
	
	public ContractDTO readById(Long id) {
       Contract found = this.repo.findById(id).orElseThrow(ContractNotFoundException::new);
        return this.mapToDTO(found);
    }
//	public ContractDTO readByLength(String length) {
//		Contract found = this.repo.ContractBylength(length).orElseThrow(ContractNotFoundException::new);
//		return this.mapToDTO(found);
//	}
	
}