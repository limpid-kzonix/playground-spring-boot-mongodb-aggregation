package com.omniesoft.commerce.statistic.omniestatistic.models.services.impl;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.NewsLogPayload;
import com.omniesoft.commerce.statistic.omniestatistic.models.entities.OrganizationNewsViewsLogEntity;
import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.OrganizationNewsViewsLogRepository;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.OrganizationNewsViewsLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationNewsViewsLogServiceImpl implements OrganizationNewsViewsLogService {

	private OrganizationNewsViewsLogRepository newsViewsLogRepository;

	@Override
	public void insert(NewsLogPayload logPayload) {
		OrganizationNewsViewsLogEntity entity = new OrganizationNewsViewsLogEntity();
		entity.setDateTime(logPayload.getDateTime());
		entity.setNewsId(logPayload.getNewsId().toString());
		entity.setOrganizationId(logPayload.getOrganizationId().toString());
		entity.setUserId(logPayload.getUserId().toString());

		newsViewsLogRepository.insert(entity);
	}
}
