package com.range.rangEGuard.dto;

public class MemberDto {
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
	@Override
	public String toString() {
		return "MemberDto [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + "]";
	}
	public MemberDto(String userId, String userPw, String userName) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
	}
	public MemberDto() {
		
	}
}
