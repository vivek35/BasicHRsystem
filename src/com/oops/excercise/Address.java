package com.oops.excercise;

public class Address {
	private int zip;
	private String country;
	private String state;
	private String city;
	private String line1;
	private String line2;
	
	public void setAddress(int zip, String country, String state, String city, String line1, String line2) {
		
		this.zip=zip;
		this.country=country;
		this.state=state;
		this.city=city;
		this.line1=line1;
		this.line2=line2;
	}
	public String getAddress() {
		String address="Zip: "+zip+" Country: "+country+" State: "+state+" City: "+city+" Line1: "+line1+" Line2: "+line2;
		return address;
	}
	
}
