package com.omniesoft.commerce.statistic.omniestatistic.models.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "users_activity")
public class UserActivityEntity {

	@Id
	@Field(value = "_id")
	private String id;
	@Field(value = "user_id")
	private String userId;

}
