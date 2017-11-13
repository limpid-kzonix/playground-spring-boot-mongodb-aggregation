package com.omniesoft.commerce.statistic.omniestatistic.models.services.impl;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.OrgLogPayload;
import com.omniesoft.commerce.statistic.omniestatistic.models.entities.OrganizationViewsLogEntity;
import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.OrganizationViewsLogRepository;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.OrganizationViewsLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationViewsLogServiceImpl implements OrganizationViewsLogService {
	private OrganizationViewsLogRepository organizationShowsLogRepository;

	@Override
	public void insert(OrgLogPayload logPayload) {
		OrganizationViewsLogEntity entity = new OrganizationViewsLogEntity();
		entity.setDateTime(logPayload.getDateTime());
		entity.setOrganizationId(logPayload.getOrganizationId().toString());
		entity.setUserId(logPayload.getUserId().toString());

		organizationShowsLogRepository.insert(entity);
	}
}
