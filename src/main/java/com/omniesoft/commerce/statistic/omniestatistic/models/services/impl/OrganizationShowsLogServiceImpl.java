package com.omniesoft.commerce.statistic.omniestatistic.models.services.impl;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.OrgLogPayload;
import com.omniesoft.commerce.statistic.omniestatistic.models.entities.OrganizationShowsLogEntity;
import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.OrganizationShowsLogRepository;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.OrganizationShowsLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationShowsLogServiceImpl implements OrganizationShowsLogService {

	private OrganizationShowsLogRepository organizationShowsLogRepository;

	@Override
	public void insert(OrgLogPayload logPayload) {
		OrganizationShowsLogEntity entity = new OrganizationShowsLogEntity();
		entity.setDateTime(logPayload.getDateTime());
		entity.setOrganizationId(logPayload.getOrganizationId().toString());
		entity.setUserId(logPayload.getUserId().toString());

		organizationShowsLogRepository.insert(entity);
	}
}
