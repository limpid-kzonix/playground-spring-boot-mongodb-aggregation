package com.omniesoft.commerce.statistic.omniestatistic.controllers;

import com.omniesoft.commerce.common.ws.statistic.impl.payload.OrgLogPayload;
import com.omniesoft.commerce.common.ws.statistic.impl.payload.UserLogPayload;
import com.omniesoft.commerce.statistic.omniestatistic.models.enums.FavoriteType;
import com.omniesoft.commerce.statistic.omniestatistic.models.enums.UserActionType;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.OrganizationFavoritesLogService;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.OrganizationShowsLogService;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.OrganizationViewsLogService;
import com.omniesoft.commerce.statistic.omniestatistic.models.services.UserActivityLogService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "users")
public class UserLoggingInController {

	private UserActivityLogService userActivityLogService;
	private OrganizationViewsLogService organizationViewsLogService;
	private OrganizationFavoritesLogService organizationFavoritesLogService;
	private OrganizationShowsLogService organizationShowsLogService;


	@PostMapping(path = "/profile")
	public void insertProfileChanges(
			@RequestBody UserLogPayload payload
	)
	{

		userActivityLogService.insert(payload, UserActionType.PROFILE);
	}

	@PostMapping(path = "/password")
	public void insertPasswordChanges(
			@RequestBody UserLogPayload payload
	)
	{

		userActivityLogService.insert(payload, UserActionType.PASSWORD);
	}

	@PostMapping(path = "/settings")
	public void insertSettingsChanges(
			@RequestBody UserLogPayload payload
	)
	{

		userActivityLogService.insert(payload, UserActionType.SETTING);
	}

	@PostMapping(path = "/cards/omnie")
	public void insertUsingOmnieCard(
			@RequestBody UserLogPayload payload
	)
	{

		userActivityLogService.insert(payload, UserActionType.OMNIE_CARD);
	}

	@PostMapping(path = "/cards/holder")
	public void insertUsingCardHolder(
			@RequestBody UserLogPayload payload
	)
	{

		userActivityLogService.insert(payload, UserActionType.CARD_HOLDER);
	}

	@PostMapping(path = "/order/history")
	public void readOrderHistory(
			@RequestBody UserLogPayload payload
	)
	{

		userActivityLogService.insert(payload, UserActionType.ORDER);
	}

	@PostMapping(path = "/organizations/search")
	public void insertToOrganizationSearchingLog(
			@RequestBody OrgLogPayload payload,
			@RequestParam(name = "pattern") String searchingPattern
	) {

	}

	@PostMapping(path = "/organizations/favorites/")
	public void insertToOrganizationFavoritesLog(
			@RequestBody OrgLogPayload payload,
			@RequestParam(name = "type") FavoriteType type
	){
		organizationFavoritesLogService.insert(payload, type);
	}

	@PostMapping(path = "/organizations/shows")
	public void insertToOrganizationsShowsLog(

	) {

	}

	@PostMapping(path = "/organizations/views")
	public void insertToOrganizationViewsLog(

	) {

	}

	@PostMapping(path = "/services/shows")
	public void insertToServiceShowsLog(

	) {

	}

	@PostMapping(path = "/services/views")
	public void insertToServiceViewsLog(

	) {

	}

	@PostMapping(path = "/news/shows")
	public void insertToNewsShowsLog(

	) {

	}

	@PostMapping(path = "/news/views")
	public void insertToNewsViewsLog(

	) {

	}


}
