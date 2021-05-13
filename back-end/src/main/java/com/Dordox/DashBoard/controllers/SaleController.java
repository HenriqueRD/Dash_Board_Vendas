package com.Dordox.DashBoard.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dordox.DashBoard.dto.SaleDTO;
import com.Dordox.DashBoard.dto.SaleSuccessDTO;
import com.Dordox.DashBoard.dto.SaleSumDTO;
import com.Dordox.DashBoard.service.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = service.findAll(pageable);
		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/sumBySeller")
	public ResponseEntity<List<SaleSumDTO>> amountGrupedBySeller() {
		List<SaleSumDTO> list = service.amountGrupedBySeller();
		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/successBySeller")
	public ResponseEntity<List<SaleSuccessDTO>> amountSuccessBySeller() {
		List<SaleSuccessDTO> list = service.amountSuccessBySeller();
		
		return ResponseEntity.ok(list);
	}
}
