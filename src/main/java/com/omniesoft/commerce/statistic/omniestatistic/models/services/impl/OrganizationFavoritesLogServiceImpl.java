package com.omniesoft.commerce.statistic.omniestatistic.models.services.impl;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.OrgLogPayload;
import com.omniesoft.commerce.statistic.omniestatistic.models.entities.OrganizationFavoritesLogEntity;
import com.omniesoft.commerce.statistic.omniestatistic.models.enums.FavoriteType;
import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.OrganizationFavoritesLogRepository;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.OrganizationFavoritesLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationFavoritesLogServiceImpl implements OrganizationFavoritesLogService {

	private OrganizationFavoritesLogRepository organizationFavoritesLogRepository;

	@Override
	public void insert(OrgLogPayload logPayload, FavoriteType type) {

		OrganizationFavoritesLogEntity organizationFavoritesLogEntity = new OrganizationFavoritesLogEntity();
		organizationFavoritesLogEntity.setAction(type);
		organizationFavoritesLogEntity.setUserId(logPayload.getUserId().toString());
		organizationFavoritesLogEntity.setOrganizationId(logPayload.getOrganizationId().toString());
		organizationFavoritesLogEntity.setDateTime(logPayload.getDateTime());

		organizationFavoritesLogRepository.insert(organizationFavoritesLogEntity);
	}
}
