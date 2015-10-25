/**
 * 
 */
package com.home.iamhere.model;

import java.util.List;

import com.home.iamhere.entity.Review;

/**
 * @author karthik
 *
 */
public class PlaceResponse {

	private String googlePlaceID;
	private String lat;
	private String lng;

	private List<Review> reviews;

	public String getGooglePlaceID() {
		return googlePlaceID;
	}

	public void setGooglePlaceID(String googlePlaceID) {
		this.googlePlaceID = googlePlaceID;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

}
