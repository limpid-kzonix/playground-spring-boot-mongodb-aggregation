package com.omniesoft.commerce.statistic.omniestatistic.models.services;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.OrgLogPayload;

public interface OrganizationViewsLogService
{
	void insert(OrgLogPayload logPayload);
}
