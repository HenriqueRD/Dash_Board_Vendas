package com.Dordox.DashBoard.dto;

import java.io.Serializable;

import com.Dordox.DashBoard.entities.Seller;

public class SaleSuccessDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String seller;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO() {
		
	}

	public SaleSuccessDTO(Seller entity, Long visited, Long deals) {
		this.seller = entity.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
}
