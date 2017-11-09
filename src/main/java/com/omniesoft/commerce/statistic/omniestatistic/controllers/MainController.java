package com.omniesoft.commerce.statistic.omniestatistic.controllers;

import com.omniesoft.commerce.statistic.omniestatistic.models.entities.ServiceViewsLogEntity;
import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.ServiceVisitorsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {

	private ServiceVisitorsRepository serviceVisitorsRepository;

	@GetMapping("/index")
	public List<ServiceViewsLogEntity> index(){
		ServiceViewsLogEntity serviceVisitorsEntity = new ServiceViewsLogEntity();
		serviceVisitorsEntity.setServiceId("hello");
		serviceVisitorsEntity.setUserId("no");
		serviceVisitorsEntity.setDateTime(LocalDateTime.now());
		serviceVisitorsRepository.save(serviceVisitorsEntity);
		return serviceVisitorsRepository.findAll();
	}

}
