package com.omniesoft.commerce.statistic.omniestatistic.models.repositories;

import com.omniesoft.commerce.statistic.omniestatistic.models.entities.ServiceFavoritesLogEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ServiceFavoritesLogRepository extends MongoRepository<ServiceFavoritesLogEntity, String>
{

}
