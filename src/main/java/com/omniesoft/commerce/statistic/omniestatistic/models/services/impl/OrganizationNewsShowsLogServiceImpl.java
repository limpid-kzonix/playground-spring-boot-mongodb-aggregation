package com.omniesoft.commerce.statistic.omniestatistic.models.services.impl;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.NewsLogPayload;
import com.omniesoft.commerce.statistic.omniestatistic.models.entities.OrganizationNewsShowsLogEntity;
import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.OrganizationNewsShowsLogRepository;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.OrganizationNewsShowsLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationNewsShowsLogServiceImpl implements OrganizationNewsShowsLogService {

	private OrganizationNewsShowsLogRepository newsShowsLogRepository;

	@Override
	public void insert(NewsLogPayload logPayload) {

		OrganizationNewsShowsLogEntity entity = new OrganizationNewsShowsLogEntity();
		entity.setDateTime(logPayload.getDateTime());
		entity.setNewsId(logPayload.getNewsId().toString());
		entity.setOrganizationId(logPayload.getOrganizationId().toString());
		entity.setUserId(logPayload.getUserId().toString());

		newsShowsLogRepository.insert(entity);
	}
}
