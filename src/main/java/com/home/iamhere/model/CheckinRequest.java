/**
 * 
 */
package com.home.iamhere.model;

/**
 * @author karthik
 *
 */
public class CheckinRequest {

	private String userId;
	private String googlePlaceID;
	private String lat;
	private String lng;
	private String placeName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

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

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

}
