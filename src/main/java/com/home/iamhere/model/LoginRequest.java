package com.home.iamhere.model;

/**
 * @author karthik
 *
 */
public class LoginRequest {
	private String emailId;
	private String facebookAccessToken;
	private String facebokUID;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFacebookAccessToken() {
		return facebookAccessToken;
	}

	public void setFacebookAccessToken(String facebookAccessToken) {
		this.facebookAccessToken = facebookAccessToken;
	}

	public String getFacebokUID() {
		return facebokUID;
	}

	public void setFacebokUID(String facebokUID) {
		this.facebokUID = facebokUID;
	}

}
