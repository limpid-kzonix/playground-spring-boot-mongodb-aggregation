package com.omniesoft.commerce.statistic.omniestatistic.models.services;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.NewsLogPayload;

public interface OrganizationNewsViewsLogService
{
	void insert(NewsLogPayload logPayload);
}
