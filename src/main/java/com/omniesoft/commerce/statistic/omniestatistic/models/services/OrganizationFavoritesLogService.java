package com.omniesoft.commerce.statistic.omniestatistic.models.services;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.OrgLogPayload;
import com.omniesoft.commerce.common.ws.statistic.impl.enums.FavoriteType;

public interface OrganizationFavoritesLogService
{
	void insert(OrgLogPayload logPayload, FavoriteType type);
}
