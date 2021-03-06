package com.Dordox.DashBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Dordox.DashBoard.dto.SaleDTO;
import com.Dordox.DashBoard.dto.SaleSuccessDTO;
import com.Dordox.DashBoard.dto.SaleSumDTO;
import com.Dordox.DashBoard.entities.Sale;
import com.Dordox.DashBoard.repositories.SaleRepository;
import com.Dordox.DashBoard.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		
		return result.map(x -> new SaleDTO(x));		
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGrupedBySeller() {
		return repository.amountGrupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> amountSuccessBySeller() {
		return repository.amountSuccessBySeller();
	}
}
