package com.omniesoft.commerce.statistic.omniestatistic.models.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Document(collection = "service_visitors")
@Data
public class ServiceVisitorsEntity {

	@Id
	@Field(value = "_id")
	private String id;

	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime visitDateTime;

	private String userId;

	private String organizationId;

}
