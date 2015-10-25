/*package com.home.iamhere.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.home.iamhere.entity.Place;
import com.home.iamhere.entity.User;
import com.home.iamhere.model.LoginRequest;
import com.home.iamhere.repository.PlaceRepository;
import com.home.iamhere.repository.UserRepository;
import com.wordnik.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/api")
@Api(value = "batch", description = "Endpoint for Batch related requests")
public class WebApplicationController {
	private static Logger logger = LoggerFactory
			.getLogger(WebApplicationController.class);
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PlaceRepository placeRepository;
	
	@Autowired
	private Facebook facebook;
	
	@RequestMapping("/")
	public ModelAndView index() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("time", new Date());
		model.put("message", "Hello Sender!");
		
		logger.info("Saying Hello to Sender");
		return new ModelAndView("index", model);
	}
	
	@RequestMapping("/secure")
	public ModelAndView dashboard() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("time", new Date());
		model.put("message", "Hello Authenticated Sender!");
		
		return new ModelAndView("index", model);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/login",produces="application/json")
	public ResponseEntity<LoginRequest>  login(@RequestBody LoginRequest request){
		logger.debug("TOKEN {} EMAIL {} FacebookUID {}",request.getFacebookAccessToken(),request.getEmailId(),request.getFacebokUID());
		Place place = new Place();
		place.setName("Black");
		place.setCreatedDate(new Date());
		
		Place place2 = new Place();
		place2.setName("BlackAgain");
		place2.setCreatedDate(new Date());
		
		List<Place> places = new ArrayList<Place>();
		places.add(place);
		places.add(place2);
		places = placeRepository.findAll();
		
		places.get(0).setName("new name");
		places.get(1).setName("new name 2");
		
		places = placeRepository.save(places);
		User user = new User();
		user.setFacebookID("asdfasdf");
		user.setPlaces(places);
		
		userRepository.save(user);
		
		return new ResponseEntity<LoginRequest>(request,HttpStatus.CREATED);
	}
	
	
	
}
*/