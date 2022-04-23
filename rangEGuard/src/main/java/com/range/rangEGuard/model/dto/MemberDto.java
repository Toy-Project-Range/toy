package com.range.rangEGuard.model.dto;

public class MemberDto {
	private int seq; //기본 키 id를 삭제하거나 변경을 우려하여 보통 따로 pk를 준다고 해서 이렇게 생성
	private String id; 
	private String pw;
	private String profileName; //프로필 사진 추가시 이미지 파일 이름
	private String prifileUri; //이미지파일 경로
	private String tier;
	private String stack; //프론트 or 백 or 풀스택
	private String language; 
	private String info; //자기소개
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getPrifileUri() {
		return prifileUri;
	}
	public void setPrifileUri(String prifileUri) {
		this.prifileUri = prifileUri;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public String getStack() {
		return stack;
	}
	public void setStack(String stack) {
		this.stack = stack;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "MemberDto [seq=" + seq + ", id=" + id + ", pw=" + pw + ", profileName=" + profileName + ", prifileUri="
				+ prifileUri + ", tier=" + tier + ", stack=" + stack + ", language=" + language + ", info=" + info
				+ "]";
	}
	
	//생성자 없는 이유 -> mapper를 dao가 주입받아서 생성하는 경우 기본생성자만 있으면 된다고 하셨어요. 정확히는 이해 못함.
	
}
