package com.omniesoft.commerce.statistic.omniestatistic.controllers;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.ServiceLogPayload;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/service/logs")
public class ServiceLoggingInController {

	@PostMapping(path = "/views")
	public void insertServiceViewsLog(
			ServiceLogPayload serviceLogPayload
	){

	}


	@PostMapping(path = "/shows")
	public void insertServiceShowsLog(
			ServiceLogPayload serviceLogPayload
	){

	}

	@PostMapping(path = "/favorites")
	public void insertServiceFavoritesLog(
			ServiceLogPayload serviceLogPayload
	){

	}
}
