package com.omniesoft.commerce.statistic.omniestatistic.models.repositories.impl;

import com.omniesoft.commerce.statistic.omniestatistic.models.repositories.ServiceVisitorsRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class ServiceVisitorsRepositoryImpl implements ServiceVisitorsRepositoryCustom {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void update() {

	}
}
