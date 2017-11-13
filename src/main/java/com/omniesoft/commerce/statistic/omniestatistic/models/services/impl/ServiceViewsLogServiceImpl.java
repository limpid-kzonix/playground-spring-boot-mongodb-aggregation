package com.omniesoft.commerce.statistic.omniestatistic.models.services.impl;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.ServiceLogPayload;
import com.omniesoft.commerce.statistic.omniestatistic.models.entities.ServiceViewsLogEntity;
import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.ServiceViewsLogRepository;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.ServiceViewsLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceViewsLogServiceImpl implements ServiceViewsLogService {

	private ServiceViewsLogRepository serviceShowsLogRepository;

	@Override
	public void insert(ServiceLogPayload logPayload) {

		ServiceViewsLogEntity entity = new ServiceViewsLogEntity();
		entity.setDateTime(logPayload.getDateTime());
		entity.setServiceId(logPayload.getServiceId().toString());
		entity.setUserId(logPayload.getUserId().toString());

		serviceShowsLogRepository.insert(entity);
	}
}
