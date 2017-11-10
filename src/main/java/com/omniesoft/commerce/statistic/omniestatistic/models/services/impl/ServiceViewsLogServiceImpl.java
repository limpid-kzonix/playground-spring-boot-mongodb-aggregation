package com.omniesoft.commerce.statistic.omniestatistic.models.services.impl;

import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.ServiceViewsLogRepository;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.ServiceViewsLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ServiceViewsLogServiceImpl implements ServiceViewsLogService {

	private ServiceViewsLogRepository serviceVisitorsRepository;
}
