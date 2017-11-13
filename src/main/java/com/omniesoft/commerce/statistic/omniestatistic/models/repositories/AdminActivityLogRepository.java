package com.omniesoft.commerce.statistic.omniestatistic.models.repositories;

import com.omniesoft.commerce.statistic.omniestatistic.models.entities.AdminActivityLogEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AdminActivityLogRepository extends MongoRepository<AdminActivityLogEntity, String>
{

}