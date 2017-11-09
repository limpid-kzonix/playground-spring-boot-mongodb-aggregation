package com.omniesoft.commerce.statistic.omniestatistic.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Document(collection = "service_favorites")
public class ServiceFavoritesEntity {
	@Id
	@Field(value = "_id")
	private String id;

	@Field(value = "user_id")
	private String userId;

	@Field(value = "service_id")
	private String organizationId;

	@Field(value = "date_time")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDateTime dateTime;
}
