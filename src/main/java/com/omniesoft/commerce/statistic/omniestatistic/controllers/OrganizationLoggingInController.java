package com.omniesoft.commerce.statistic.omniestatistic.controllers;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.OrgLogPayload;
import com.omniesoft.commerce.statistic.omniestatistic.models.enums.FavoriteType;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.OrganizationFavoritesLogService;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.OrganizationShowsLogService;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.OrganizationViewsLogService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/organizations")
public class OrganizationLoggingInController {

	private OrganizationViewsLogService organizationViewsLogService;
	private OrganizationFavoritesLogService organizationFavoritesLogService;
	private OrganizationShowsLogService organizationShowsLogService;

	@PostMapping(path = "/favorites/")
	public void insertOrganizationLog(
			@RequestBody OrgLogPayload payload,
			@RequestParam(name = "type") FavoriteType type
			){
		organizationFavoritesLogService.insert(payload, type);
	}
}
