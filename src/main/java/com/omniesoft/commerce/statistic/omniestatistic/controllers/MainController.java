package com.omniesoft.commerce.statistic.omniestatistic.controllers;

import com.omniesoft.commerce.statistic.omniestatistic.models.entities.ServiceViewsLogEntity;
import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.ServiceViewsLogRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/server")
public class MainController {

	private ServiceViewsLogRepository serviceVisitorsRepository;

	@GetMapping("/index")
	public String index(@RequestHeader(HttpHeaders.AUTHORIZATION) String token){

		ServiceViewsLogEntity serviceVisitorsEntity = new ServiceViewsLogEntity();
		serviceVisitorsEntity.setServiceId("hello");
		serviceVisitorsEntity.setUserId("no");
		serviceVisitorsEntity.setDateTime(LocalDateTime.now());
		serviceVisitorsRepository.save(serviceVisitorsEntity);
		return token;
	}

}
