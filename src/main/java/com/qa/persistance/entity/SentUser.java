package com.qa.persistance.entity;

public class SentUser {
	
	private String name;
	private Long memberNumber;
	
	public SentUser(User user) {
		this.name = user.getName();
		this.memberNumber = user.getMemberNumber();
	}
	
	public SentUser() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(Long memberNumber) {
		this.memberNumber = memberNumber;
	}
}
