package com.example.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.persistence.domain.Contract;
import com.example.rest.dto.ContractDTO;
import com.example.service.ContractService;

import lombok.AllArgsConstructor;
@RestController
public class ContractController {
	@Autowired	
private ContractService service;

@PostMapping("/addContract")
public ContractDTO addcontract(@RequestBody Contract contract) {
	return service.addContract(contract);
}

@GetMapping("/AllContracts")
public List<ContractDTO> getAllContracts(){
	return this.service.getAllContracts();
}

@PutMapping("/updateContract/{id}")
public ContractDTO updateContract(@PathVariable Long id, @RequestBody Contract contract) {
	return service.updateContract(id, contract);
}

@DeleteMapping("/deleteContract/{id}")
public boolean deleteContract(@PathVariable Long id) {
	return service.deleteContract(id);
}

@GetMapping("/ContractById")
public ContractDTO readContractById(@PathParam("id") Long id) {
	return service.readById(id);
}
//@GetMapping("/ContractByLength")
//public ContractDTO readByLength(@PathParam("Length") String length){
//return service.readByLength(length);
//}
}