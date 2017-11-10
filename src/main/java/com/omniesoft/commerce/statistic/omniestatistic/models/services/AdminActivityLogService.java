package com.omniesoft.commerce.statistic.omniestatistic.models.services;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.AdminLogPayload;
import com.omniesoft.commerce.statistic.omniestatistic.models.enums.AdminActionType;

public interface AdminActivityLogService
{
	void insert(AdminLogPayload logPayload, AdminActionType type);
}
