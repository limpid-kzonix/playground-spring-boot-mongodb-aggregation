package com.omniesoft.commerce.statistic.omniestatistic.models.repositories;

import com.omniesoft.commerce.statistic.omniestatistic.models.entities.ServiceVisitorsEntity;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;

@Repository
@Transactional
public interface ServiceVisitorsRepository extends ReactiveMongoRepository<ServiceVisitorsEntity, String> {

	@Override
	@Query("{ $visitDateTime:  }")
	Flux<ServiceVisitorsEntity> findAll();
}
