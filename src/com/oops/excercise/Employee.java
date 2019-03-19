package com.oops.excercise;

import java.util.*;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String Address;
	private String Phone;
	
	Phone ph=new Phone();
	Address addr=new Address();
	
	public void setEmployee(int id,String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;
	}
	
	public int getEmpID() {
		return id;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	
	
	public String getPhone() {
		return ph.getPhone();
	}
	public String getAddress() {
		return addr.getAddress();
	}
	public void setPhone(int ar,int num,int ccode) {
		ph.setPhone(ar, num, ccode);
	}
	public void setAddress(int zp, String cty, String st, String ct, String ln1, String ln2) {
		addr.setAddress(zp, cty, st, ct, ln1, ln2);
	}
}
