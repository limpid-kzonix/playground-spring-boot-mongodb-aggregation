package com.omniesoft.commerce.statistic.omniestatistic.models.services;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.ServiceLogPayload;
import com.omniesoft.commerce.common.ws.statistic.impl.enums.FavoriteType;

public interface ServiceFavoritesLogService
{
	void insert(ServiceLogPayload logPayload, FavoriteType type);
}
