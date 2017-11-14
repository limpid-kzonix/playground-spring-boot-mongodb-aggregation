package com.omniesoft.commerce.statistic.omniestatistic.models.services.impl;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.ServiceLogPayload;
import com.omniesoft.commerce.statistic.omniestatistic.models.entities.ServiceFavoritesLogEntity;
import com.omniesoft.commerce.common.ws.statistic.impl.enums.FavoriteType;
import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.ServiceFavoritesLogRepository;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.ServiceFavoritesLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceFavoritesLogServiceImpl implements ServiceFavoritesLogService {

	private ServiceFavoritesLogRepository favoritesLogRepository;

	@Override
	public void insert(ServiceLogPayload logPayload, FavoriteType type) {

		ServiceFavoritesLogEntity entity = new ServiceFavoritesLogEntity();
		entity.setDateTime(logPayload.getDateTime());
		entity.setServiceId(logPayload.getServiceId().toString());
		entity.setAction(type);
		entity.setUserId(logPayload.getUserId().toString());
		favoritesLogRepository.insert(entity);
	}
}
