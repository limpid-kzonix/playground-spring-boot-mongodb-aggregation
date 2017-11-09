package com.omniesoft.commerce.statistic.omniestatistic.controllers;

import com.omniesoft.commerce.statistic.omniestatistic.models.entities.ServiceVisitorsEntity;
import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.ServiceVisitorsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;

@RestController
@AllArgsConstructor
public class MainController {

	private ServiceVisitorsRepository serviceVisitorsRepository;

	@GetMapping("/index")
	public Flux<ServiceVisitorsEntity> index(){
		ServiceVisitorsEntity serviceVisitorsEntity = new ServiceVisitorsEntity();
		serviceVisitorsEntity.setOrganizationId("hello");
		serviceVisitorsEntity.setUserId("no");
		serviceVisitorsEntity.setVisitDateTime(LocalDateTime.now());
		serviceVisitorsRepository.save(serviceVisitorsEntity).block();
		return serviceVisitorsRepository.findAll();
	}

}
