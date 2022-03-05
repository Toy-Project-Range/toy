package com.range.rangEGuard.dto;

public class MemberDTO {
	private String userId;
	private String userPw;
	private String userName;
	
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public String getuserId() {
		return userId;
	}
	public void setuserId(String userId) {
		this.userId = userId;
	}
	public String getuserPw() {
		return userPw;
	}
	public void setuserPw(String userPw) {
		this.userPw = userPw;
	}
	
}
