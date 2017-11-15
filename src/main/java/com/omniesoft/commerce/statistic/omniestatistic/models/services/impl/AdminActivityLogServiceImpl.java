package com.omniesoft.commerce.statistic.omniestatistic.models.services.impl;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.AdminLogPayload;
import com.omniesoft.commerce.statistic.omniestatistic.models.enums.AdminActionType;
import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.AdminActivityLogRepository;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.AdminActivityLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AdminActivityLogServiceImpl implements AdminActivityLogService {

	private AdminActivityLogRepository adminActivityLogRepository;

	@Override
	public void insert(AdminLogPayload logPayload, AdminActionType type) {


	}
}
