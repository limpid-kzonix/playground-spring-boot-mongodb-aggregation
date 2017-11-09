package com.omniesoft.commerce.statistic.omniestatistic.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "users")
public class UserStatisticInController {

	@PostMapping(path = "/profile")
	public void insertProfileChanges() {

	}

	@PostMapping(path = "/password")
	public void insertPasswordChanges() {

	}

	@PostMapping(path = "/cards/omnie")
	public void insertUsingOmnieCard() {

	}

	@PostMapping(path = "/cards/holder")
	public void insertCardHolder() {

	}

	@PostMapping(path = "/order/history")
	public void readOrderHistory() {

	}

	@PostMapping(path = "/organizations/search")
	public void insertOrganizationSearching() {

	}

	@PostMapping(path = "/organizations/shows")
	public void insertOrganizationsShows() {

	}

	@PostMapping(path = "/organizations/views")
	public void insertOrganizationViews(){

	}
	@PostMapping(path = "/services/shows")
	public void insertServiceShows(){

	}

	@PostMapping(path = "/services/views")
	public void insertServiceViews(){

	}

	@PostMapping(path = "/news/shows")
	public void insertNewsShows(){

	}

	@PostMapping(path = "/news/views")
	public void insertNewsViews(){

	}


}
