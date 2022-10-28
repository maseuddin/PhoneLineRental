package com.example.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Contract does not exist with that ID")
public class ContractNotFoundException extends EntityNotFoundException{
	public ContractNotFoundException() {}
	public ContractNotFoundException(String msg) {
		super(msg);
	}

}