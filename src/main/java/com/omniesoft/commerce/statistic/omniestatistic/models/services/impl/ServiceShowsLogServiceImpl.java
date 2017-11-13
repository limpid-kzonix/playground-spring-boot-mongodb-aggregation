package com.omniesoft.commerce.statistic.omniestatistic.models.services.impl;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.ServiceLogPayload;
import com.omniesoft.commerce.statistic.omniestatistic.models.entities.ServiceShowsLogEntity;
import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.ServiceShowsLogRepository;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.ServiceShowsLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceShowsLogServiceImpl implements ServiceShowsLogService {

	private ServiceShowsLogRepository serviceShowsLogRepository;

	@Override
	public void insert(ServiceLogPayload logPayload) {

		ServiceShowsLogEntity entity = new ServiceShowsLogEntity();
		entity.setDateTime(logPayload.getDateTime());
		entity.setServiceId(logPayload.getServiceId().toString());
		entity.setUserId(logPayload.getUserId().toString());

		serviceShowsLogRepository.insert(entity);
	}
}
