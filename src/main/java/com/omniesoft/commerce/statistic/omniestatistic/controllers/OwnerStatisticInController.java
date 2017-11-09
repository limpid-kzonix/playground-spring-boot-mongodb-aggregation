package com.omniesoft.commerce.statistic.omniestatistic.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/owner/logs/")
public class OwnerStatisticInController {

	@PostMapping(path = "/organizations")
	public void insertOrganizationLog(){

	}

	@PostMapping(path = "/organizations/services")
	public void insertServiceLog(){

	}
	@PostMapping(path = "/organizations/news")
	public void insertNewsLog(){

	}

	@PostMapping(path = "/organizations/discounts")
	public void insertDiscountLog(){

	}

	@PostMapping(path = "/organizations/clients")
	public void insertClientGroupLog(){

	}

	@PostMapping(path = "/organizations/orders")
	public void insertOrdersLog(){

	}

}
