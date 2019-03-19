package com.oops.excercise;

import java.util.List;

public class Role extends Employee{
	private List<String> roles;
	
	public Role(List<String> roles) {
		
		this.roles=roles;
	}
	public String getPhone() {
		String get_phone = ph.getPhone();
		return get_phone;
	}
	public List<String> getRole() {
		return roles;
	}
}
