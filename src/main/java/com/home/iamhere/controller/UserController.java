package com.home.iamhere.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.home.iamhere.model.CheckinRequest;
import com.home.iamhere.model.LoginRequest;
import com.home.iamhere.model.MapDetail;
import com.home.iamhere.model.ReviewRequest;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/api")
@Api(value = "user", description = "Endpoint for User Related operations")
public class UserController {

	private static Logger logger = LoggerFactory
			.getLogger(UserController.class);
	
	@RequestMapping(method = RequestMethod.POST, value="/login",produces="application/json")
	@ApiOperation(httpMethod = "POST", value = "Endpoint to Login", notes = "This api is used for login i.e get the server access token for further communication")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Logged in "),
			@ApiResponse(code = 500, message = "Something wrong on the server end ."),
			@ApiResponse(code = 400, message = "Wrong data from the client")})
	public ResponseEntity<String>  login(@RequestBody LoginRequest request){
		logger.debug("TOKEN {} EMAIL {} FacebookUID {}",request.getFacebookAccessToken(),request.getEmailId(),request.getFacebokUID());
		return new ResponseEntity<String>("Accepted",HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/checkin",produces="application/json")
	@ApiOperation(httpMethod = "POST", value = "Endpoint to Checkin", notes = "This api is used for checkin ")
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Checkedin in "),
			@ApiResponse(code = 500, message = "Something wrong on the server end ."),
			@ApiResponse(code = 400, message = "Wrong data from the client")})
	public ResponseEntity<String>  checkin(@RequestBody CheckinRequest request){
		logger.info("checkedin");
		return new ResponseEntity<String>("success",HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/review",produces="application/json")
	@ApiOperation(httpMethod = "POST", value = "Endpoint to Review", notes = "This api is used for review")
	@ApiResponses(value = {
			@ApiResponse(code = 201, message = "Reviewed"),
			@ApiResponse(code = 500, message = "Something wrong on the server end ."),
			@ApiResponse(code = 400, message = "Wrong data from the client")})
	public ResponseEntity<String>  review(@RequestBody ReviewRequest request){
		logger.info("reviewed");
		return new ResponseEntity<String>("success",HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/map",produces="application/json")
	@ApiOperation(httpMethod = "GET", value = "Endpoint to Get Map details", notes = "This api is used for map")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Checkedin in "),
			@ApiResponse(code = 500, message = "Something wrong on the server end ."),
			@ApiResponse(code = 400, message = "Wrong data from the client")})
	public ResponseEntity<List<MapDetail>>  mapDetails(){
		logger.info("Map details recieved");
		List<MapDetail> mapDetails = new ArrayList<MapDetail>();
		return new ResponseEntity<List<MapDetail>>(mapDetails,HttpStatus.OK);
	}
}
