package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepositories;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepositories repositories;

	public List<SellerDTO> findAll() {
		List<Seller> result = repositories.findAll();	
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
